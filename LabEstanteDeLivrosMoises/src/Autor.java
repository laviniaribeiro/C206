public class Autor {
    //atributos do autor
    String nome; //nome do autor
    int anoNascimento; //ano de nascimento do autor
    String profissao; //profissao do autor

    //mostrando informações do autor
    void mostrarInfos(){
        System.out.println("++++++++ INFORMAÇÕES DO AUTOR +++++++++");
        System.out.println("Nome: " +nome);
        System.out.println("Ano de nascimento: " +anoNascimento);
        System.out.println("Profissão: " +profissao);
    }
}
