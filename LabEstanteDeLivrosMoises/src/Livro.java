public class Livro {
    //atributos dos livros
    String titulo; //titulo do livro
    String genLiterario; //genero literario do livro
    int qntFolhas; //quantidade de folhas do livro
    String editora; //editora que produz o livro

    Autor [] autor = new Autor[120];

    //mostrando informações dos livros
    void mostrarInfos(){
        System.out.println("+++++++ INFORMAÇÕES DOS LIVROS ++++++++");
        System.out.println("Titulo: " +titulo);
        System.out.println("Genero literario: " +genLiterario);
        System.out.println("Quantidade de folhas: " +qntFolhas);
        System.out.println("Editora: " +editora);

        //percorrendo o array
        for(int i=0; i < autor.length; i++){
            if(autor[i] != null){ //verificando se a posicao i esta preenchida
                autor[i].mostrarInfos(); //mostrando a informacao do autor
            }
        }
    }
}
