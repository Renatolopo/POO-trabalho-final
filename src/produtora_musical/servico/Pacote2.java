package produtora_musical.servico;

import produtora_musical.funcionario.Diretor;
import produtora_musical.funcionario.ProdutorMusica;
import produtora_musical.funcionario.ProdutorVideoClipe;
import produtora_musical.funcionario.Vendedor;

public class Pacote2 extends Servico{
    private ProdutorMusica produtorMusica;
    private ProdutorVideoClipe produtorClipe;

    public Pacote2(double orcamento, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica,
                   ProdutorVideoClipe produtorClipe){
        super(orcamento, vendedor, diretor);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
        this.produtorClipe = produtorClipe;
    }
}
