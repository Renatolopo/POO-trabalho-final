package produtora_musical.cliente;

import produtora_musical.servico.Servico;

public class Cliente {
    private String nome;
    private Servico servico;
    private static int codigo = 0;

    public Cliente(String nome){
        this.nome = nome;
        this.codigo += 1;
    }

    public void contratarServico(Servico servico){
        this.servico = servico;
    }

}

