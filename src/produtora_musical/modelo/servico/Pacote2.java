package produtora_musical.modelo.servico;

import produtora_musical.modelo.funcionario.Diretor;
import produtora_musical.modelo.funcionario.ProdutorMusica;
import produtora_musical.modelo.funcionario.ProdutorVideoClipe;
import produtora_musical.modelo.funcionario.Vendedor;

public class Pacote2 extends Servico {
    private ProdutorMusica produtorMusica;
    private ProdutorVideoClipe produtorClipe;

    public Pacote2(double orcamento, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica,
                   ProdutorVideoClipe produtorClipe, String nome){
        super(orcamento, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
        this.produtorClipe = produtorClipe;
    }
}
