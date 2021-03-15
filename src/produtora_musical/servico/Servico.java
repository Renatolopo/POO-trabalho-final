package produtora_musical.servico;

import produtora_musical.funcionario.Diretor;
import produtora_musical.funcionario.Vendedor;

public abstract class Servico {
    private double orcamento;
    private Vendedor vendedor;
    private Diretor diretor;
    private static int codigo = 0;

    public Servico(double orcamento, Vendedor vendedor,
                   Diretor diretor){
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
