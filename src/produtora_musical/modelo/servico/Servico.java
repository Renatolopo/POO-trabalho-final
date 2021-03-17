package produtora_musical.modelo.servico;

import produtora_musical.modelo.funcionario.Diretor;
import produtora_musical.modelo.funcionario.Vendedor;

public abstract class Servico {
    private String nomeDoProjeto;
    private double orcamento;
    private Vendedor vendedor;
    private Diretor diretor;
    private static int codigo = 0;

    public Servico(double orcamento, Vendedor vendedor,
                   Diretor diretor, String nomeDoProjeto){
        this.nomeDoProjeto = nomeDoProjeto;
        this.diretor = diretor;
        this.orcamento = orcamento;
        this.vendedor = vendedor;
        this.codigo += 1;
    }

    // TODO: add serviços em produtor

    public double getOrcamento() {
        return orcamento;
    }
}
