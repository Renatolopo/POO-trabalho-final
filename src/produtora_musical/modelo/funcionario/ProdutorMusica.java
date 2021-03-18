package produtora_musical.modelo.funcionario;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ProdutorMusica extends Funcionario{
    private int quantidadeMusicaProduzida;
    private int metaDeMusicas;


    public ProdutorMusica(String nome, double salario, int metaDeMusicas){
        super(nome, salario, "ProdMusical");
        this.metaDeMusicas = metaDeMusicas;
        this.quantidadeMusicaProduzida = 0;
    }


    public void addQuantidadeDeMusica(){
        this.quantidadeMusicaProduzida += 1;
    }
}
