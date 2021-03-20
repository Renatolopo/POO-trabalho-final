package produtora_musical.controle;

import produtora_musical.dados.ClienteDAO;
import produtora_musical.dados.FuncionarioDAO;
import produtora_musical.modelo.cliente.Cliente;
import produtora_musical.modelo.funcionario.*;

import java.io.BufferedReader;
import java.io.IOException;

public class CarregarDados {
    public static void setFuncionarios() throws IOException {
        String p = "/home/renato/Documentos/git/POO-trabalho-final/src/produtora_musical/dados/funcionarios.txt";
        BufferedReader buffRead = ManipuladorDeArquivos.leitor(p);

        String linha = "";
        while (true) {
            if (linha != null) {
                try {
                    String row[] = linha.split(",");
                    Funcionario funcionario = null;
                    if (row[0].equals("diretor")) {
                        int metaProjetos = Integer.parseInt(row[1]);
                        String nome = row[2];
                        double salario = Double.parseDouble(row[3]);
                        funcionario = new Diretor(metaProjetos, nome, salario);

                    }else if(row[0].equals("marketing")){
                        String nome = row[1];
                        double salario = Double.parseDouble(row[2]);
                        funcionario = new Marketing(nome,salario);

                    }else  if(row[0].equals("produtor musica")){
                        String nome = row[1];
                        double salario = Double.parseDouble(row[2]);
                        int meta = Integer.parseInt(row[3]);
                        funcionario = new ProdutorMusica(nome, salario, meta);

                    }else if(row[0].equals("produtor clipe")){
                        String nome = row[1];
                        double salario = Double.parseDouble(row[2]);
                        int meta = Integer.parseInt(row[3]);
                        funcionario = new ProdutorVideoClipe(nome, salario, meta);

                    }else if(row[0].equals("vendedor")){
                        String nome = row[1];
                        double salario = Double.parseDouble(row[2]);
                        funcionario = new Vendedor(nome, salario);

                    }

                    if(funcionario != null) {
                        FuncionarioDAO.addFuncionario(funcionario);
                    }
                }catch (ArrayIndexOutOfBoundsException e){

                }

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void setClientes() throws IOException{
        String p = "/home/renato/Documentos/git/POO-trabalho-final/src/produtora_musical/dados/clientes.txt";
        BufferedReader buffRead = ManipuladorDeArquivos.leitor(p);

        String linha = "";
        while (true) {
            if (linha != null) {
                if(linha != "") {
                    Cliente cliente = new Cliente(linha);
                    ClienteDAO.addCliente(cliente);
                }
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}
