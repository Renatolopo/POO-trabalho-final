package produtora_musical.funcionario;

public class Vendedor extends Funcionario{
    private int quantidadeDeServicosVendidos;

    public Vendedor(String nome, double salario, int quantidadeDeServicosVendidos){
        super(nome, salario);
        this.quantidadeDeServicosVendidos = quantidadeDeServicosVendidos;
    }
    
}
