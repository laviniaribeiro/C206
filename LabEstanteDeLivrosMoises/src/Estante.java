public class Estante {
    //atributos explicitos da estante
    int idEstante; //id da estante
    char letra;

    //atributo implicito da estante
    Livro [] livros = new Livro[120];

    //adicionando livros na estante
    void addLivros(Livro livro){
        for(int i=0; i < livros.length; i++){ //percorrendo o array de livros
            if(livros[i] == null){ //verificando se a posição i esta vazia
                livros[i] = livro; //adicionando o livro na posição i
                break; //parando a execução
            }
        }
    }

    //vendo porcentagem de cada genero literario
    void porcentagemGen(){
        //contadores de cada genero literario
        int genDrama = 0;
        int genSuspense = 0;
        int outrosGen = 0;

        for(int i=0; i < livros.length; i++){ //percorrendo o array
            if(livros[i] != null){ //verificando se a posicao i esta preenchida
                //logica para contar a quantidade de generos literarios
                if(livros[i].genLiterario.equalsIgnoreCase("Drama"))
                    genDrama++;
                else if(livros[i].genLiterario.equalsIgnoreCase("Suspense"))
                    genSuspense++;
                else
                    outrosGen++;
            }
        }

        //realizando a conta da porcentagem
        int porcDrama = (genDrama*100)/120;
        int porcSuspense = (genSuspense*100)/120;
        int porcOutros = (outrosGen*100)/120;

        System.out.println("PORCENTAGEM DE CADA GÊNERO LITERÁRIO");
        System.out.println("Gênerio drama: " +porcDrama +"%");
        System.out.println("Gênerio suspense: " +porcSuspense +"%");
        System.out.println("Outros generos: " +porcOutros +"%");
    }

    //vendo livros com mais e menos paginas
    void livroMaisEMenosPag(){
        int maisPaginas = -1; //armazena o livro com mais paginas cadastrado
        int menosPaginas = 99999; //armazena o livro com menos paginas cadastrado
        int posMais = 0; //armazena a posição do livro com mais paginas
        int posMenos = 0; //armazena a posição do livro com menos paginas

        for(int i=0; i < livros.length; i++){ //percorrendo o array para verificar cada uma das posições
             if(livros[i] != null){ //verificando se na posicao i ha um livro
                 if(livros[i].qntFolhas > maisPaginas){
                     maisPaginas = livros[i].qntFolhas;
                     posMais = i;
                 }
             }
             if(livros[i].qntFolhas < menosPaginas){
                 menosPaginas = livros[i].qntFolhas;
                 posMenos = i;
             }
        }
        if(posMais == 0 && posMenos == 0){
            System.out.println("Não há livros na estante!");
        }
        else{
            System.out.println();
            System.out.println("INFORMAÇÕES DO LIVRO COM MAIS PAGINAS");
            livros[posMais].mostrarInfos();
            System.out.println();
            System.out.println("INFORMAÇÕES DO LIVRO COM MENOS PAGINAS");
            livros[posMenos].mostrarInfos();
        }
    }

    //mostrando informacoes da estante
    void mostrarInfos(){
        System.out.println("+++++++++++ INFORMACOES DA ESTANTE ++++++++++++");
        System.out.println("Id da estante: " +idEstante);
    }
}
