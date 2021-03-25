package produtora_musical.modelo.cliente;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private static int cont = 0;
    private int codigo;
    private ArrayList<Servico> servicos = new ArrayList<>();

    public Cliente(String nome){
        this.nome = nome;
        this.cont += 1;
        this.codigo = cont;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void addServico(Servico servico){
        this.servicos.add(servico);
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void info(){
        System.out.println("------------------------------");
        System.out.println("\t\t Informações do Cliente");
        System.out.printf("Nome: %s\nServiços:", this.getNome());
        for(Servico servico : this.getServicos()){
            System.out.printf("%s \tcodigo: %d\n", servico.getNomeDoProjeto(), servico.getCodigo());
        }
        System.out.println("------------------------------");
    }
}

