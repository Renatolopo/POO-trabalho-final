package produtora_musical.modelo.servico;

import produtora_musical.modelo.funcionario.*;

public class Pacote3 extends Servico {
    private ProdutorMusica produtorMusica;
    private ProdutorVideoClipe produtorClipe;
    private Marketing marketing;

    public Pacote3(double orcamento, Vendedor vendedor,
                   Diretor diretor, ProdutorMusica produtorMusica,
                   ProdutorVideoClipe produtorClipe, Marketing marketing, String nome){
        super(orcamento, vendedor, diretor, nome);
        this.produtorMusica = produtorMusica;
        this.produtorMusica.addServico(this);
        this.produtorClipe = produtorClipe;
        this.marketing = marketing;
    }
}
