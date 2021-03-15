package produtora_musical.funcionario;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private static int codigo = 0;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.codigo += 1;
    }

    public double getSalario() {
        return salario;
    }
}
