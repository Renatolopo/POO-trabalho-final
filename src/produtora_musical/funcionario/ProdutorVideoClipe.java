package produtora_musical.funcionario;

public class ProdutorVideoClipe extends Funcionario{
    private int quantidadeVideosProduzido;
    private int metaDeVideos;

    public ProdutorVideoClipe(String nome, double salario,
                              int quantidadeVideosProduzido, int metaDeVideos){
        super(nome, salario);
        this.quantidadeVideosProduzido = quantidadeVideosProduzido;
        this.metaDeVideos = metaDeVideos;
    }


}
