package produtora_musical.controle;

import produtora_musical.dados.FuncionarioDAO;
import produtora_musical.modelo.funcionario.Funcionario;

public class FuncionarioControlador {
    public void setFuncionario(Funcionario funcionario){
        FuncionarioDAO.addFuncionario(funcionario);
    }
    public  Funcionario buscarFuncionario(int codigo){
        return FuncionarioDAO.buscarFuncionario(codigo);
    }
    public void listFuncionarios(){
        FuncionarioDAO.listFuncionarios("todos");
    }
}

