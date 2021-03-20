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
        //this.produtorMusica.addServico(this);
        this.produtorClipe = produtorClipe;
    }

    public Funcionario getProdutorClipe() {
        return produtorClipe;
    }

    public Funcionario getProdutorMusica() {
        return produtorMusica;
    }
}
