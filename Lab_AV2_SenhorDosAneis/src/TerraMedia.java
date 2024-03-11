public class TerraMedia {

    //atributos implicitos da terra media
    private Habitante []herois = new Habitante[10];

    //metodos da terra media
    //adicionando habitantes na terra media
    public void addHabitante(Habitante habitante){
        for(int i=0; i< herois.length; i++){
            //conferindo se a posiçao i esta vazia
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    //listando habitantes (mostrando todas as informações a cerca dos habitantes)
    public void listarHabitantes(){
        //usando for para percorrer todos os habitantes da terra media
        for(int i=0; i< herois.length; i++){
            //verificando se existe algum habitante na posição i
            if(herois[i] != null){
                //verificando de qual tipo é aquele habitante
                if(herois[i] instanceof Anao){
                    //realizando casting para anao
                    //herois[i] -> Habitante
                    Anao auxAnao = (Anao)herois[i];
                    auxAnao.mostraInfo();
                    auxAnao.minerar();
                    auxAnao.atacar();
                }
                else if(herois[i] instanceof Elfo){
                    //realizando casting para elfo
                    Elfo auxElfo = (Elfo)herois[i];
                    auxElfo.mostraInfo();
                    auxElfo.atacar();
                    auxElfo.curar();
                    auxElfo.viajar();
                }
                else{
                    //realizando casting para mago
                    Mago auxMago = (Mago)herois[i];
                    auxMago.mostraInfo();
                    auxMago.lancarFeitico();
                    auxMago.atacar();
                    auxMago.curar();
                }
            }
        }
    }
}
