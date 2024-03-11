import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //entrada de dados
        Scanner entrada = new Scanner(System.in);

        //criando o objeto da estante
        Estante estante = new Estante();
        estante.idEstante = 12345;

        //criando o menu
        boolean controle = true;

        while(controle){
            System.out.println("++++++++++ SISTEMA DA ESTANTE ++++++++++");
            System.out.println("Selecione a opção que deseja: ");
            System.out.println("1- Adicionar livros à estante");
            System.out.println("2- Mostrar as informações da estante e dos livros");
            System.out.println("3- Porcentagem de livros de cada gênero literário");
            System.out.println("4- Informações do livro e do autor do livro com mais e menos páginas");
            System.out.println("5- Sair do menu");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 1:
                    Livro li_vro = new Livro();
                    System.out.println("Título do livro: ");
                    li_vro.titulo = entrada.nextLine();
                    System.out.println("Gênero literario: ");
                    li_vro.genLiterario = entrada.nextLine();
                    System.out.println("Número de páginas: ");
                    li_vro.qntFolhas = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Editora: ");
                    li_vro.editora = entrada.nextLine();

                    //adicionando o livro à estante
                    estante.addLivros(li_vro);

                    break;
                case 2:
                    estante.mostrarInfos();
                   // li_vro.mostrarInfos();

                    break;
                case 3:
                    estante.porcentagemGen();

                    break;
                case 4:
                    estante.livroMaisEMenosPag();

                    break;
                case 5:
                    System.out.println("SAINDO DO SISTEMA...");
                    controle = false;

                    break;
                default:
                    System.out.println("INVÁLIDO");

                    break;
            }
        }
    }
}
