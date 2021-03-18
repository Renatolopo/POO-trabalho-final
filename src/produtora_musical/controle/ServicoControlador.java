package produtora_musical.controle;

import produtora_musical.dados.ServicoDAO;
import produtora_musical.modelo.servico.Servico;

public class ServicoControlador {
    public void addServico(Servico servico){
        ServicoDAO.addServico(servico);
    }
    public Servico buscarServico(int codigoServico){
        return ServicoDAO.buscarServico(codigoServico);
    }
}

