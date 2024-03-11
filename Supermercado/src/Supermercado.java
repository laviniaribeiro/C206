public class Supermercado {
    String nome; //nome do supermercado
    String cnpj; //CNPJ do supermercado
    String endereco; //endereço do supermercado
    String numTelefone; //numero de telefone do supermercado

    //criando array
    Produto [] produtos = new Produto[30];

    //adicionando produtos
    void addProduto(Produto p){
        for(int i=0; i < produtos.length; i++){ //percorrendo o array de produtos
            if(produtos[i] == null){ //verificando se a posicao i esta vazia
                produtos[i] = p; //adicionando o produto na posição i
                break; //barrando a execução
            }
        }
    }

    //mostrando o produto mais caro e o mais barato
    void mostrarMaisCaroBarato(){
        double maisCaro = -1;
        double maisBarato = 9999;
        int posMaisCaro = 0;
        int posMaisBarato = 0;

        for(int i=0; i < produtos.length; i++){ //varrendo o array de produtos
            if(produtos[i] != null){ //verificando se tem produto na posicao i
                if(produtos[i].valor > maisCaro){
                    maisCaro = produtos[i].valor;
                    posMaisCaro = i;
                }
                if(produtos[i].valor < maisBarato){
                    maisBarato = produtos[i].valor;
                    posMaisBarato = i;
                }
            }
        }

        //mostrando informações do produto mais caro
        System.out.println("+++++++++++ INFORMAÇÕES DO PRODUTO MAIS CARO DO SUPERMERCADO ++++++++++");
        produtos[posMaisCaro].mostrarInfos();

        //mostrando informações do produto mais barato
        System.out.println("+++++++++++ INFORMAÇÕES DO PRODUTO MAIS BARATO DO SUPERMERCADO ++++++++++++");
        produtos[posMaisBarato].mostrarInfos();
    }

    //contando as categorias
    void contarCategorias(){
        //contadores de categorias
        int produtosHigiene = 0;
        int produtosDeUtensilio = 0;
        int produtosAlimenticios = 0;

        for(int i=0; i < produtos.length; i++){ //percorrendo o array
            if(produtos[i] != null){ //verificando se a posicao i esta preenchida
                //logica para contar as categorias dos produtos
                if(produtos[i].categoria.equalsIgnoreCase("Higiene"))
                    produtosHigiene++;
                else if(produtos[i].categoria.equalsIgnoreCase("Utensilio"))
                    produtosDeUtensilio++;
                else if(produtos[i].categoria.equalsIgnoreCase("Alimenticio"))
                    produtosAlimenticios++;
            }
        }

        System.out.println("QUANTIDADE DE PRODUTOS DE CADA CATEGORIA");
        System.out.println("Produtos de higiene: " +produtosHigiene);
        System.out.println("Produtos de utensílio " +produtosDeUtensilio);
        System.out.println("Produtos alimenticios: " +produtosAlimenticios);
    }

    //mostrando informações do supermercado
    void mostraInfo(){
        System.out.println("++++++++++ MOSTRANDO INFORMAÇÕES DO SUPERMERCADO +++++++++");
        System.out.println("Nome do supermercado: " +nome);
        System.out.println("CNPJ do supermercado: " +cnpj);
        System.out.println("Endereço do supermercado: " +endereco);
        System.out.println("Numero de telefone: " +numTelefone);

        //percorrendo o array
        for(int i=0; i < produtos.length; i++){
            if(produtos[i] != null){ //verificando se a posicao i esta preenchida
                produtos[i].mostrarInfos(); //mostrando a informacao do produto
            }
        }
    }

}
