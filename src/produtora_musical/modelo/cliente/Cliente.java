package produtora_musical.modelo.cliente;

import produtora_musical.modelo.servico.Servico;

public class Cliente {
    private String nome;
    private Servico servico;
    private static int cont = 0;
    private int codigo;

    public Cliente(String nome){
        this.nome = nome;
        this.cont += 1;
        this.codigo = cont;
    }

    public void contratarServico(Servico servico){
        this.servico = servico;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return codigo;
    }
}

