package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ProdutorMusica extends Funcionario{
    private int metaDeMusicas;

    public ProdutorMusica(String nome, double salario, int metaDeMusicas){
        super(nome, salario, "ProdMusical");
        this.metaDeMusicas = metaDeMusicas;
    }
    public boolean tenBonificacao(){
        if(this.getQuantidadeDeServicos() >= metaDeMusicas){
            return true;
        }else{
            return false;
        }
    }
    public double getBoniicacao(){
        if(tenBonificacao()){
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

}
