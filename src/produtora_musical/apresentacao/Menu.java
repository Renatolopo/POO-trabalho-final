package produtora_musical.apresentacao;

import produtora_musical.controle.ClienteControlador;
import produtora_musical.controle.FuncionarioControlador;
import produtora_musical.dados.ClienteDAO;
import produtora_musical.dados.FuncionarioDAO;
import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.*;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opc;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------");
            System.out.println("\t\t\tBEM VINDO");
            System.out.println("-----------------------------------");
            System.out.print("1 - Cadastrar Funcionario\n" +
                    "2 - Cadastrar Serviço\n" +
                    "3 - Cadastrar Cliente\n" +
                    "0 - Sair\n" +
                    ":");

            opc = Integer.parseInt(scan.nextLine());
            System.out.println("-----------------------------------");

            if(opc == 1){
                cadastrarFuncionario(scan);
            }else if(opc == 2){
                cadastrarServico(scan);
            } else if(opc == 3){
                cadastrarCliente(scan);
            }

        }while(opc != 0);

    }

    private static void cadastrarServico(Scanner scan) {
        System.out.print("Escolha qual pacote de Serviço será contratado:\n" +
                "Pacote 1 - (Somente produção de Música)\n" +
                "Pacote 2 - (Produção de música com video clipe)\n" +
                "Pacote 3 - (Musica com video clipe e Trabalho de Marketing)\n" +
                ": ");
        int opc = Integer.parseInt(scan.nextLine());
        System.out.print("Informe o Valor do orçamento deste projeto: ");
        double orcamentoProjeto = Double.parseDouble(scan.nextLine());

        System.out.println("------------------------------------------");
        System.out.println("\t\t\t LISTA DE VENDEDORES");
        System.out.println("------------------------------------------");
        FuncionarioDAO.listFuncionarios("Vendedor");
        System.out.println("------------------------------------------");
        System.out.println("Informe o codigo do Vendedor responsavel: ");
        int codigoVendedor = Integer.parseInt(scan.nextLine());
        Funcionario vendedor = FuncionarioDAO.buscarFuncionario(codigoVendedor);

        System.out.println("------------------------------------------");
        System.out.println("\t\t\t LISTA DE DIRETORES");
        System.out.println("------------------------------------------");
        FuncionarioDAO.listFuncionarios("Diretor");
        System.out.println("------------------------------------------");
        System.out.println("Informe o codigo do Diretor responsavel: ");
        int codigoDiretor = Integer.parseInt(scan.nextLine());
        Funcionario diretor = FuncionarioDAO.buscarFuncionario(codigoDiretor);

    }

    private static void cadastrarCliente(Scanner scan) {
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scan.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        ClienteControlador clienteControlador = new ClienteControlador();
        clienteControlador.setCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso");
        ClienteDAO.listClientes();
    }

    private static void cadastrarFuncionario(Scanner scan) {
        System.out.print("Qual tipo de funcionario deseja cadastrar?\n" +
                "1 - Diretor\n" +
                "2 - Produtor Musical\n" +
                "3 - Produtor De Video\n" +
                "4 - Marketing\n" +
                "5 - Vedendor\n" +
                ":");
        int opc =  Integer.parseInt(scan.nextLine());
        if (opc > 0 && opc <= 5) {
            System.out.print("\nNome do funcionario: ");
            String nomeFuncionario = scan.nextLine();
            System.out.print("Salario: ");
            double salarioFuncionario = Double.parseDouble(scan.nextLine());

            Funcionario funcionario = null;

            if (opc == 1) {
                System.out.print("Meta de Projetos: ");
                int metaDeProjetos = Integer.parseInt(scan.nextLine());
                funcionario = new Diretor(metaDeProjetos, nomeFuncionario, salarioFuncionario);

            } else if (opc == 2) {
                System.out.print("Meta de musicas produzidas: ");
                int metaDeMusica = Integer.parseInt(scan.nextLine());
                funcionario = new ProdutorMusica(nomeFuncionario, salarioFuncionario, metaDeMusica);

            } else if (opc == 3) {
                System.out.print("Meta de Videos produzidos: ");
                int metaDeVideos = Integer.parseInt(scan.nextLine());
                funcionario = new ProdutorVideoClipe(nomeFuncionario, salarioFuncionario, metaDeVideos);

            } else if (opc == 4) {
                funcionario = new Marketing(nomeFuncionario, salarioFuncionario);
            } else if (opc == 5) {
                funcionario = new Vendedor(nomeFuncionario, salarioFuncionario);
            }

            FuncionarioControlador funcionarioControlador = new FuncionarioControlador();
            funcionarioControlador.setFuncionario(funcionario);
            System.out.println("Funcionario cadastrado");
        }
    }
}
