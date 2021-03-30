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

    public int getMetaDeProjetos() {
        return metaDeProjetos;
    }

    public void getInfo(){
        System.out.println("------------------------------");
        System.out.println("\t\t Informações do Funcionario");
        System.out.printf("Nome: %s\t Tipo: %s\n" +
                        "Salario: R$%.2f\t Bonificação: R$%.2f\n" +
                        "Quantidade de serviços: %d\t Meta: %d serviços\n",
                this.getNome(), this.getTipo(), this.getSalario(),
                this.getBonificacao(), this.getQuantidadeDeServicos(),
                this.getMetaDeProjetos());
        System.out.println("------------------------------");
    }

}
