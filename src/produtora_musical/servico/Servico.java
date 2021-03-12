package produtora_musical.servico;

import produtora_musical.funcionario.Diretor;
import produtora_musical.funcionario.Vendedor;

public abstract class Servico {
    private double orcamento;
    private Vendedor vendedor;
    private Diretor diretor;
    private static int codigo;
}
