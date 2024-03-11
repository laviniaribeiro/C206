import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        //criando o array de cliente
        Conta[] conta = new Conta[2];

        //criando o menu
        System.out.println("+++++++++ BEM-VINDO AO SISTEMA DO BANCO +++++++++");
        System.out.println(" ");
        System.out.println("SELECIONE 1, 2 OU 3 PARA ESCOLHER O QUE DESEJA");
        System.out.println("DIGITE 0 PARA SAIR DO MENU");
        System.out.println(" ");

        int opcao=1;
        int j=0;

        while(opcao!=0){

            System.out.println("1- Adicionar clientes ao banco");
            System.out.println(" ");
            System.out.println("2- Depositar uma quantia");
            System.out.println(" ");
            System.out.println("3- Sacar uma quantia");
            System.out.println(" ");
            System.out.println("4- Mostrar o saldo disponível");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:

                    conta[j]= new Conta();
                    System.out.print("Nome do cliente: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    conta[j].cliente.setNome(nome);
                    entrada.nextLine();
                    System.out.print("CPF do cliente: ");

                    long cpf = entrada.nextLong();
                    conta[j].cliente.setCpf(cpf);

                    j++;
                    break;

                case 2:
                    conta[j].deposita(1000);
                    System.out.println(conta[j].getSaldo());
                    break;

                case 3:
                    conta[j].sacar(300);
                    System.out.println(conta[j].getSaldo());
                    break;

                case 4:
                    System.out.println(conta[j].getSaldo());
                    break;

                case 0:


                    break;

                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }

            System.out.println("DIGITE A OPÇÃO DESEJADA CASO QUEIRA REALIZAR OUTRA ATIVIDADE");
            System.out.println("1- Adicionar clientes ao banco");
            System.out.println(" ");
            System.out.println("2- Depositar uma quantia");
            System.out.println(" ");
            System.out.println("3- Sacar uma quantia");
            System.out.println(" ");
            System.out.println("4- Mostrar o saldo disponível");
            opcao = entrada.nextInt();
        }
    }
}
