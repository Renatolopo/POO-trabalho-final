package produtora_musical.dados;

import produtora_musical.modelo.cliente.Cliente;

import java.util.ArrayList;

public class ClienteDAO {
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    // TODO: busca com codigo ao inves de nome
    public static Cliente buscarCliente(String nomeCliente){
        Cliente cliente = null;
        for(Cliente clienteEmPesquisa : clientes){
            if(clienteEmPesquisa.getNome().equals(nomeCliente)){
                cliente = clienteEmPesquisa;
                break;
            }
        }
        return cliente;
    }

    public static void listClientes(){
        for(Cliente cliente : clientes){
            System.out.printf("Nome: %s  -  Codigo: %d\n", cliente.getNome(), cliente.getCodigo());
        }
    }
}
