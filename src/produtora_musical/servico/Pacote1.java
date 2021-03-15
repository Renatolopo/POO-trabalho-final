package produtora_musical.servico;

import produtora_musical.funcionario.Diretor;
import produtora_musical.funcionario.ProdutorMusica;
import produtora_musical.funcionario.Vendedor;

public class Pacote1 extends Servico{
    private ProdutorMusica produtorMusica;

    public Pacote1(double orcamento, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica){
        super(orcamento, vendedor, diretor);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
    }
}
