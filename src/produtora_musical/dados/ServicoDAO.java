package produtora_musical.dados;

import produtora_musical.modelo.servico.Servico;

import java.util.ArrayList;

public class ServicoDAO {
    private static ArrayList<Servico> servicos = new ArrayList<>();

    public static void addServico(Servico servico){
        servicos.add(servico);
    }
    public static Servico buscarServico(int codigoServico){
        Servico servico = null;
        for(Servico servicoEmBusca : servicos){
            if(servicoEmBusca.getCodigo() == codigoServico){
                servico = servicoEmBusca;
            }
        }
        return servico;
    }
    public static void listServico(){
        for(Servico servico : servicos){
            System.out.println("-----");
            System.out.printf("Nome do projeto: %s\n" +
                    "Codigo: %d\n",
                    servico.getNomeDoProjeto(), servico.getCodigo());
            System.out.println("-----");
        }
    }
}
