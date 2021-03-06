package produtora_musical.modelo.servico;

import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.*;

public class Pacote3 extends Servico {
    private Funcionario produtorMusica;
    private Funcionario produtorClipe;
    private Funcionario marketing;

    public Pacote3(double orcamento, Cliente cliente, Funcionario vendedor,
                   Funcionario diretor, Funcionario produtorMusica,
                   Funcionario produtorClipe, Funcionario marketing, String nome){
        super(orcamento, cliente, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorClipe = produtorClipe;
        this.marketing = marketing;
    }

    public Funcionario getMarketing() {
        return marketing;
    }

    public Funcionario getProdutorMusica() {
        return produtorMusica;
    }

    public Funcionario getProdutorClipe() {
        return produtorClipe;
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("\t\t Informações Sobre o Servico");
        System.out.printf("Pacote contratado: Pacote 3 - (Musica com video clipe e Trabalho de Marketing)\n" +
                        "Nome: %s\t\t Orçamento: %.2f\n" +
                        "Cliente: %s\t\t Vendedor: %s\n" +
                        "Diretor: %s\t\t Produtor Musical: %s\n" +
                        "Produtor VideoClipe: %s\t\t Marketing: %s\n", this.getNomeDoProjeto(),
                this.getOrcamento(), this.getCliente().getNome(),
                this.getVendedor().getNome(), this.getDiretor().getNome(),
                this.getProdutorMusica().getNome(), this.getProdutorClipe().getNome(),
                this.getMarketing().getNome());
        System.out.println("------------------------------");
    }
}
