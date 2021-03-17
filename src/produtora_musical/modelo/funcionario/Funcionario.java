package produtora_musical.modelo.funcionario;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private static int cont = 0;
    private int idFuncionario;
    private String tipo;

    public Funcionario(String nome, double salario, String tipo){
        this.nome = nome;
        this.salario = salario;
        this.cont += 1;
        this.idFuncionario = this.cont;
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public  int getIdFuncionario() {
        return this.idFuncionario;
    }

    public String getTipo() {
        return tipo;
    }
}