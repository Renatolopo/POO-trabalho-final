package produtora_musical.modelo.funcionario;

public class Diretor extends Funcionario{
    private int metaDeProjetos;

    public Diretor(int metaProjetos, String nome, double salario){
        super(nome, salario, "Diretor");
        this.metaDeProjetos = metaProjetos;
    }

    public double getBonificacao(){
        if(temBonificacao()) {
            double salario = this.getSalario();
            return (10 * salario) / 100;
        }else{
            return 0;
        }
    }
    public boolean temBonificacao(){
        if(this.getQuantidadeDeServicos() >= metaDeProjetos){
            return true;
        }else{
            return false;
        }
    }

}
