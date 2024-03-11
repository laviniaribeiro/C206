import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Lavínia Ribeiro", 147852369);

        //array para armazenar os computadores comprados
        Computador [] compras = new Computador[10];

        //criando computadores
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive", 16);
        Computador computador1 = new Computador("Positivo", 2300, "Linux Ubuntu", 32,"Pentium Core i3", 2200, memoria1);

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive", 32);
        Computador computador2 = new Computador("Acer", 5800, "Windows 8", 64, "Pentium Core i5", 3370, memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 10000);
        Computador computador3 = new Computador("Vaio", 1800, "Windows 10", 64, "Pentium Core i7", 4500, memoria3);


        //criando o menu
        System.out.println("+++++++++ BEM-VINDO A LOJA DE COMPUTADORES +++++++++");
        System.out.println(" ");
        System.out.println("SELECIONE 1, 2 OU 3 PARA ESCOLHER UM COMPUTADOR");
        System.out.println("DIGITE 0 PARA SAIR DO MENU");
        System.out.println(" ");
        System.out.println("----- PROMOÇÃO 1 -----");
        computador1.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("----- PROMOÇÃO 2 -----");
        computador2.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("----- PROMOÇÃO 3 -----");
        computador3.mostraPCConfigs();

        int opcao = entrada.nextInt();
        entrada.nextLine();

        float totalCompra = 0;
        int j = 0;

        while(opcao!=0){
            switch (opcao){
                case 1:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador1.preco);
                    compras[j] = computador1;
                    j++;
                    break;

                case 2:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador2.preco);
                    compras[j] = computador2;
                    j++;
                    break;

                case 3:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computador3.preco);
                    compras[j] = computador3;
                    j++;
                    break;

                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }

            System.out.println("DIGITE A OPÇÃO DESEJADA CASO QUEIRA ADQUIRIR OUTRO COMPUTADOR");
            opcao = entrada.nextInt();
        }

        System.out.println("Nome do cliente: " +cliente.nome);
        System.out.println("CPF do cliente: " +cliente.cpf);
        System.out.println(" ");
        System.out.println("Computadores comprados:");
        System.out.println(" ");

        for(int i=0; i < compras.length; i++){
            if(compras[i] != null){ //verificando se a posicao i esta ocupada
                compras[i].mostraPCConfigs();
                System.out.println(" ");

            }
            else
                break;
        }

        System.out.println("Total da compra: R$" +totalCompra);
    }
}

