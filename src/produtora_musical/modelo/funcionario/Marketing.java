package produtora_musical.modelo.funcionario;

public class Marketing extends Funcionario{
    private int quantidadeDePublicicdade;

    public Marketing(String nome, double salario){
        super(nome, salario, "Marketing");
        this.quantidadeDePublicicdade = 0;
    }

    public void addQuantidadeDePublicidade(){
        this.quantidadeDePublicicdade += 1;
    }

}
