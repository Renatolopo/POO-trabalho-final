package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class Marketing extends Funcionario {
    private int quantidadeDePublicicdade;

    public Marketing(String nome, double salario){
        super(nome, salario, "Marketing");
    }

    public boolean temBonificacao(){
        return true;
    }
    public double getBonificacao(){
        ArrayList<Servico> servicos = getServicos();
        double bonificacao = 0;
        for(Servico servico : servicos){
            bonificacao += (servico.getOrcamento() * 2)/100;
        }
        return 0;
    }

}
