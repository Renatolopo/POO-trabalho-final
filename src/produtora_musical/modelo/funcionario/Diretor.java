package produtora_musical.modelo.funcionario;

public class Diretor extends Funcionario{
    private int quantidadeDeProjetosDirigidos;
    private int metaDeProjetos;

    public Diretor(int metaProjetos, String nome, double salario){
        super(nome, salario, "Diretor");
        this.metaDeProjetos = metaProjetos;
        this.quantidadeDeProjetosDirigidos = 0;
    }

    public double getBonificacao(){
        double salario = this.getSalario();
        return (10 * salario) / 100;
    }
    public void addQuantidadeDeProjetos(){
        this.quantidadeDeProjetosDirigidos += 1;
    }
}
