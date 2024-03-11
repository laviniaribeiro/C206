public class Main {
    public static void main(String[] args){

        //criando a cidade
        Cidade cidade = new Cidade();

        //criando armas para atribuir aos humanos
        Arma arma1 = new Arma();
        arma1.setTipoArma("Revolver");
        arma1.setForca(1000);

        Arma arma2 = new Arma();
        arma2.setTipoArma("Submetralhadora");
        arma2.setForca(2000);

        //criando os personagens
        Humano humano1 = new Humano();
        humano1.setNome("Joel");
        humano1.setIdade(43);
        humano1.setVida(100);
        humano1.setEnergia(90);
        humano1.setDistanciaEscuta(10);
        humano1.modificarHabilidade(13,"Energia");
        humano1.modificarHabilidade(9,"Escuta");
        humano1.arma = arma2;

        Humano humano2 = new Humano();
        humano2.setNome("Ellie");
        humano2.setIdade(14);
        humano2.setVida(100);
        humano2.setEnergia(100);
        humano2.setDistanciaEscuta(15);
        humano2.modificarHabilidade(10, "Energia");
        humano2.modificarHabilidade(5,"Escuta");
        humano2.arma = arma1;

        Zumbi zumbi1 = new Zumbi();
        zumbi1.setVida(20);
        zumbi1.setDiasInfeccao(300);

        Zumbi zumbi2 = new Zumbi();
        zumbi2.setVida(25);
        zumbi2.setDiasInfeccao(400);

        //adicionando os personagens na cidade
        cidade.adicionarPersonagens(humano1);
        cidade.adicionarPersonagens(humano2);
        cidade.adicionarPersonagens(zumbi1);
        cidade.adicionarPersonagens(zumbi2);

        //mostrando as informações dos personagens
        cidade.listarPersonagens();
    }
}
