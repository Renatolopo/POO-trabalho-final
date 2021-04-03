package produtora_musical.modelo.servico;

import produtora_musical.dados.ClienteDAO;
import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.Diretor;
import produtora_musical.modelo.funcionario.Funcionario;
import produtora_musical.modelo.funcionario.Vendedor;

public abstract class Servico implements InterfaceServico{
    private String nomeDoProjeto;
    private double orcamento;
    private Funcionario vendedor;
    private Funcionario diretor;
    private static int cont = 0;
    private int codigo;
    private Cliente cliente;

    public Servico(double orcamento, Cliente cliente, Funcionario vendedor,
                   Funcionario diretor, String nomeDoProjeto){
        this.nomeDoProjeto = nomeDoProjeto;
        this.diretor = diretor;
        this.orcamento = orcamento;
        this.vendedor = vendedor;
        this.cont += 1;
        this.codigo = cont;
        this.cliente = cliente;
    }


    public double getOrcamento() {
        return orcamento;
    }

    public  int getCodigo() {
        return this.codigo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
