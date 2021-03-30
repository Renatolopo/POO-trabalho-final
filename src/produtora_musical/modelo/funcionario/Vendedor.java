package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class Vendedor extends Funcionario {
    private int quantidadeDeServicosVendidos;

    public Vendedor(String nome, double salario){
        super(nome, salario, "Vendedor");
    }
    public boolean temBonificacao(){
        return true;
    }
    public double getBonificacao(){
        ArrayList<Servico> servicos = getServicos();
        double bonificacao = 0;
        for(Servico servico : servicos){
            bonificacao += (servico.getOrcamento() * 5)/100;
        }
        return bonificacao;
    }

    @Override
    public void getInfo() {
        System.out.println("------------------------------");
        System.out.println("\t\t Informações do Funcionario");
        System.out.printf("Nome: %s\t Tipo: %s\n" +
                        "Salario: R$%.2f\t Bonificação: R$%.2f\n" +
                        "Quantidade de serviços: %d\n",
                this.getNome(), this.getTipo(), this.getSalario(),
                this.getBonificacao(), this.getQuantidadeDeServicos());
        System.out.println("------------------------------");
    }
}
