package produtora_musical.dados;

import produtora_musical.modelo.cliente.Cliente;

import java.util.ArrayList;

public class ClienteDAO {
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static Cliente buscarCliente(int codigo){
        Cliente cliente = null;
        for(Cliente clienteEmPesquisa : clientes){
            if(clienteEmPesquisa.getCodigo() == codigo){
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

    public static boolean temClientes(){
        if(clientes.size() == 0){
            return false;
        }else{
            return true;
        }
    }
}
