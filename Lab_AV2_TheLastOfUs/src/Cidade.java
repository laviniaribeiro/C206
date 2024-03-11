public class Cidade {

    //atributos da cidade
    private String nome;
    private Personagem[] personagens = new Personagem[10];

    //metodos da cidade
    //adicionando personagens na cidade
    public void adicionarPersonagens(Personagem p){
        for(int i=0; i < personagens.length; i++){
            //conferindo se a posição i esta vazia
            if(personagens[i] == null){
                personagens[i] = p;
                break;
            }
        }
    }

    //listando os personagens (mostrando as informações dos personagens)
    public void listarPersonagens(){
        //usando o for para percorrer todos os personagens da cidade
        for(int i=0; i < personagens.length; i++){
            //verificando se ha personagem na posicao i
            if(personagens[i] != null){
                //verificando de qual tipo é o personagem
                if(personagens[i] instanceof Humano){
                    //realizando casting para humano
                    Humano auxHumano = (Humano)personagens[i];
                    auxHumano.mostrarInfos();
                    auxHumano.atacar();
                    auxHumano.defender();
                    auxHumano.modificarArma();
                }
                else{
                    //realizando casting para zumbi
                    Zumbi auxZumbi = (Zumbi) personagens[i];
                    auxZumbi.mostrarInfos();
                    auxZumbi.atacar();
                    auxZumbi.defender();
                    auxZumbi.infectou();
                }
            }
        }
    }
}
