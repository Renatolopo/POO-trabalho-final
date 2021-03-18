package produtora_musical.controle;

import produtora_musical.dados.ClienteDAO;
import produtora_musical.modelo.cliente.Cliente;

public class ClienteControlador {
    public void setCliente(Cliente cliente){
        ClienteDAO.addCliente(cliente);
    }
    public Cliente buscarCliente(int codigoCliente){
        return ClienteDAO.buscarCliente(codigoCliente);
    }
}
