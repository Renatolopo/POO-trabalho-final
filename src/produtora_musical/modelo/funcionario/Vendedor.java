package produtora_musical.modelo.funcionario;

public class Vendedor extends Funcionario{
    private int quantidadeDeServicosVendidos;

    public Vendedor(String nome, double salario){
        super(nome, salario, "Vendedor");
        this.quantidadeDeServicosVendidos = 0;
    }

    public void addQuantidadeDeServico(){
        this.quantidadeDeServicosVendidos += 1;
    }

    public static void listVendedor(){

    }
}
