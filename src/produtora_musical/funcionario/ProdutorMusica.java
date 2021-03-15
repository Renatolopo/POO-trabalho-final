package produtora_musical.funcionario;

import produtora_musical.servico.Servico;

import java.sql.Array;
import java.util.ArrayList;

public class ProdutorMusica extends Funcionario{
    private int quantidadeMusicaProduzida;
    private int metaDeMusicas;
    // add array para guardar todos os trabalhos que o produtor participa
    private ArrayList<Servico> servicos = new ArrayList<>();

    public ProdutorMusica(String nome, double salario, int qtdMusica, int metaDeMusicas){
        super(nome, salario);
        this.metaDeMusicas = metaDeMusicas;
        this.quantidadeMusicaProduzida = qtdMusica;
    }

    public void addServico(Servico servico){
        servicos.add(servico);
    }

    public double getBonificacao(){
        if(quantidadeMusicaProduzida >= metaDeMusicas){
            double orcamentoExtra = 0;
            int cont = 0;
            for (Servico servico : servicos){
                cont ++;
                if(cont >= metaDeMusicas){
                    orcamentoExtra += servico.getOrcamento();
                }
            }
            return (orcamentoExtra * 5)/ 100;
        }else{
            return 0;
        }
    }
}
