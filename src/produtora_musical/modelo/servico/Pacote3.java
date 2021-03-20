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
        this.produtorMusica.addServico(this);
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
}
