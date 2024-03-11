public class Main {
    public static void main(String[] args){
        //declarando o nome da cantina
        Cantina cantina = new Cantina(); //aderindi cantina à classe Cantina
        cantina.nome = "Cantina do Inatel";

        //inserindo os 3 salgados desejados
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        //adicionando o nome dos 3 salgados
        salgado1.nomeSalgado = "Coxinha";
        salgado2.nomeSalgado = "Bolinha de queijo";
        salgado3.nomeSalgado = "Esfirra";

        //adicionando os salgados na cantina
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostraInfo();

    }
}
