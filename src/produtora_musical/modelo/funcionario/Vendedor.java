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

}
