public class Cantina {
    String nome;
    Salgado [] salgados = new Salgado[3];


    void addSalgado(Salgado novoSalgado){
        for(int i=0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Há os seguintes salgados na cantiana " + nome + ": ");
        for(Salgado salgado : salgados){
            if(salgado != null){
                System.out.println(salgado.nomeSalgado);
            }
        }
    }

}
