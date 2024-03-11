public abstract class Personagem {

    //atributos dos personagens
    private static int numPersonagens = 0; //contador iniciando em 0
    private int vida;
    private int idPersonagem;

    //criando construtor da classe Personagem
    Personagem(){
        this.numPersonagens++;
        this.idPersonagem = numPersonagens;
    }

    //metodos de personagem
    public void mostrarInfos(){
        System.out.println("\n");
        System.out.println("Vida: " +this.vida);
        System.out.println("Id: " +this.idPersonagem);
    }

    //criando getters e setters
    public int getNumPersonagens(){
        return numPersonagens;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
}
