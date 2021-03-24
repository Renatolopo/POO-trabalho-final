package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ProdutorVideoClipe extends Funcionario {
    private int quantidadeVideosProduzido;
    private int metaDeVideos;

    public ProdutorVideoClipe(String nome, double salario, int metaDeVideos){
        super(nome, salario, "ProdVideo");
        this.metaDeVideos = metaDeVideos;
    }
    public boolean temBonificacao(){
        if(getQuantidadeDeServicos() >= metaDeVideos){
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
                if(cont >= metaDeVideos){
                    bonificacao += (servico.getOrcamento() * 10)/100;
                }
            }
            return bonificacao;
        }else{
            return 0;
        }
    }

}
