package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ProdutorMusica extends Funcionario{
    private int quantidadeMusicaProduzida;
    private int metaDeMusicas;
    // add array para guardar todos os trabalhos que o produtor participa
    private ArrayList<Servico> servicos = new ArrayList<>();

    public ProdutorMusica(String nome, double salario, int metaDeMusicas){
        super(nome, salario, "ProdMusical");
        this.metaDeMusicas = metaDeMusicas;
        this.quantidadeMusicaProduzida = 0;
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

    public void addQuantidadeDeMusica(){
        this.quantidadeMusicaProduzida += 1;
    }
}
