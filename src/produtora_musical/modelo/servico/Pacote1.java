package produtora_musical.modelo.servico;

import produtora_musical.modelo.funcionario.Diretor;
import produtora_musical.modelo.funcionario.ProdutorMusica;
import produtora_musical.modelo.funcionario.Vendedor;

public class Pacote1 extends Servico {
    private ProdutorMusica produtorMusica;

    public Pacote1(double orcamento, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica, String nome){
        super(orcamento, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
    }
}
