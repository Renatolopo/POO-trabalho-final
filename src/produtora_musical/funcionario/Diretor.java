package produtora_musical.funcionario;

public class Diretor extends Funcionario{
    private int quantidadeDeProjetosDirigidos;
    private int metaDeProjetos;

    public Diretor(int qtdProjetos, int metaProjetos, String nome, double salario){
        super(nome, salario);
        this.metaDeProjetos = metaProjetos;
        this.quantidadeDeProjetosDirigidos = qtdProjetos;
    }

    public double getBonificacao(){
        double salario = this.getSalario();
        return (10 * salario) / 100;
    }
}
