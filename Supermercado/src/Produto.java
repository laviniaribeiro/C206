public class Produto {
    //atributos do produto
    int codigoSerie; //codigo de serie do produto
    String nome; //nome do produto
    String categoria; //categoria do produto
    int quantidade; //quantidade de produtos
    double valor; //valor do produto

    //mostrando informações do produto
    void mostrarInfos(){
        System.out.println("+++++++++ INFORMAÇÕES DO PRODUTO ++++++++++");
        System.out.println("Código de série: " +codigoSerie);
        System.out.println("Nome do produto: " +nome);
        System.out.println("Categoria do produto: " +categoria);
        System.out.println("Quantidade de produtos: " +quantidade);
        System.out.println("Valor: " +valor);
    }
}
