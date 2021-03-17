package produtora_musical.modelo.funcionario;

public class ProdutorVideoClipe extends Funcionario{
    private int quantidadeVideosProduzido;
    private int metaDeVideos;

    public ProdutorVideoClipe(String nome, double salario, int metaDeVideos){
        super(nome, salario, "ProdVideo");
        this.quantidadeVideosProduzido = 0;
        this.metaDeVideos = metaDeVideos;
    }
    public void addQuantidadeDeVideos(){
        this.quantidadeVideosProduzido += 1;
    }

}
