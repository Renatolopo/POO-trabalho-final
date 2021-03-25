package produtora_musical.modelo.servico;

import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.Diretor;
import produtora_musical.modelo.funcionario.Funcionario;
import produtora_musical.modelo.funcionario.ProdutorMusica;
import produtora_musical.modelo.funcionario.Vendedor;

public class Pacote1 extends Servico {
    private Funcionario produtorMusica;

    public Pacote1(double orcamento, Cliente cliente, Funcionario vendedor,
                   Funcionario diretor, Funcionario produtorMusica, String nome){
        super(orcamento, cliente, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        //this.produtorMusica.addServico(this);
    }

    public Funcionario getProdutorMusica() {
        return produtorMusica;
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("\t\t Informações Sobre o Servico");
        System.out.printf("Nome: %s\t Orçamento: %.2f\n" +
                "Cliente: %s\t Vendedor: %s\n" +
                "Diretor: %s\t Produtor Musical: %s\n", this.getNomeDoProjeto(),
                this.getOrcamento(), this.getCliente().getNome(),
                this.getVendedor().getNome(), this.getDiretor().getNome(),
                this.getProdutorMusica().getNome());
        System.out.println("------------------------------");
    }
}
