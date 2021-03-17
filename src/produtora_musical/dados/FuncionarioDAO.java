package produtora_musical.dados;

import produtora_musical.modelo.funcionario.Funcionario;

import java.util.ArrayList;

public class FuncionarioDAO {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }


    public static Funcionario buscarFuncionario(int codigo){
        Funcionario funcionario = null;
        for(Funcionario funcionarioEmPesquisa : funcionarios){
            if(funcionarioEmPesquisa.getIdFuncionario() == codigo){
                funcionario = funcionarioEmPesquisa;
                break;
            }
        }
        return funcionario;
    }

    public static void listFuncionarios(String tipo){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getTipo() == tipo) {
                System.out.printf("Nome:%s - codigo:%d\n", funcionario.getNome(), funcionario.getIdFuncionario());
            }
        }
    }
}
