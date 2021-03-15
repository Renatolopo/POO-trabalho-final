package produtora_musical.funcionario;

public class Marketing extends Funcionario{
    private int quantidadeDePublicicdade;

    public Marketing(String nome, double salario, int qtdPublicidade){
        super(nome, salario);
        this.quantidadeDePublicicdade = qtdPublicidade;
    }

}
