package produtora_musical.modelo.servico;

import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.*;

public class Pacote3 extends Servico {
    private Funcionario produtorMusica;
    private Funcionario produtorClipe;
    private Marketing marketing;

    public Pacote3(double orcamento, Cliente cliente, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica,
                   ProdutorVideoClipe produtorClipe, Marketing marketing, String nome){
        super(orcamento, cliente, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
        this.produtorClipe = produtorClipe;
        this.marketing = marketing;
    }

    public Marketing getMarketing() {
        return marketing;
    }

    public Funcionario getProdutorMusica() {
        return produtorMusica;
    }

    public Funcionario getProdutorClipe() {
        return produtorClipe;
    }
}
