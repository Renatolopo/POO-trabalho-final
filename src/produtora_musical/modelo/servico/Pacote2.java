package produtora_musical.modelo.servico;

import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.*;

public class Pacote2 extends Servico {
    private Funcionario produtorMusica;
    private Funcionario produtorClipe;

    public Pacote2(double orcamento, Cliente cliente, Funcionario vendedor,
                   Funcionario diretor, Funcionario produtorMusica,
                   Funcionario produtorClipe, String nome){
        super(orcamento, cliente, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorClipe = produtorClipe;
    }

    public Funcionario getProdutorClipe() {
        return produtorClipe;
    }

    public Funcionario getProdutorMusica() {
        return produtorMusica;
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("\t\t Informações Sobre o Servico");
        System.out.printf("Pacote contratado: Pacote 2 - (Produção de música com video clipe)\n" +
                        "Nome: %s\t\t Orçamento: %.2f\n" +
                        "Cliente: %s\t\t Vendedor: %s\n" +
                        "Diretor: %s\t\t Produtor Musical: %s\n" +
                        "Produtor VideoClipe: %s\n", this.getNomeDoProjeto(),
                this.getOrcamento(), this.getCliente().getNome(),
                this.getVendedor().getNome(), this.getDiretor().getNome(),
                this.getProdutorMusica().getNome(), this.getProdutorClipe().getNome());
        System.out.println("------------------------------");
    }
}
