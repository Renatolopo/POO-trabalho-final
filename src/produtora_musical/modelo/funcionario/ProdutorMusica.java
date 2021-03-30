package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ProdutorMusica extends Funcionario{
    private int metaDeMusicas;

    public ProdutorMusica(String nome, double salario, int metaDeMusicas){
        super(nome, salario, "ProdMusical");
        this.metaDeMusicas = metaDeMusicas;
    }
    public boolean temBonificacao(){
        if(this.getQuantidadeDeServicos() >= metaDeMusicas){
            return true;
        }else{
            return false;
        }
    }
    public double getBonificacao(){
        if(temBonificacao()){
            ArrayList<Servico> servicos = getServicos();
            double bonificacao = 0;
            int cont = 0;
            for(Servico servico : servicos){
                cont ++;
                if(cont >= metaDeMusicas){
                    bonificacao += (servico.getOrcamento() * 5)/100;
                }
            }
            return bonificacao;
        }else{
            return 0;
        }
    }

    public int getMetaDeMusicas() {
        return metaDeMusicas;
    }

    @Override
    public void getInfo() {
        System.out.println("------------------------------");
        System.out.println("\t\t Informações do Funcionario");
        System.out.printf("Nome: %s\t Tipo: %s\n" +
                        "Salario: R$%.2f\t Bonificação: R$%.2f\n" +
                        "Quantidade de serviços: %d\t Meta: %d serviços\n",
                this.getNome(), this.getTipo(), this.getSalario(),
                this.getBonificacao(), this.getQuantidadeDeServicos(),
                this.getMetaDeMusicas());
        System.out.println("------------------------------");
    }
}
