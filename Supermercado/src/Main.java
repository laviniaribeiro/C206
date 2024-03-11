import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //criando o objeto da escola
        Supermercado supermercado = new Supermercado();
        supermercado.nome = "Supermercado Do Paulo";
        supermercado.endereco = "Rua Do Paulo";
        supermercado.numTelefone = "000000";
        supermercado.cnpj = "111.111.111.111";

        //criando o menu
        boolean controle = true;

        while(controle){
            System.out.println("+++++++++++ BEM VINDO AO SISTEMA DO SUPERMERCADO +++++++++++");
            System.out.println("1- Adicionar produtos ao supermercado");
            System.out.println("2- Mostrar informacoes do supermercado e de seus produtos");
            System.out.println("3- Mostrar quantidade de produtos de cada categoria");
            System.out.println("4- Mostrar informações do produto mais caro e mais barato em estoque");
            System.out.println("5- Sair");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    Produto produto = new Produto();

                    System.out.println("Código série do produto: ");
                    produto.codigoSerie = entrada.nextInt();
                    System.out.println("Nome do produto: ");
                    entrada.nextLine(); //limpando o buffer
                    produto.nome = entrada.nextLine();
                    System.out.println("Categoria do produto: ");
                    produto.categoria = entrada.nextLine();

                    //adicionando o produto ao supermercado
                    supermercado.addProduto(produto);
                    break;
                case 2:
                    supermercado.mostraInfo();
                    break;
                case 3:
                    supermercado.contarCategorias();
                    break;
                case 4:
                    supermercado.mostrarMaisCaroBarato();
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("INVÁLIDO!");
                    break;
            }
        }
    }
}

