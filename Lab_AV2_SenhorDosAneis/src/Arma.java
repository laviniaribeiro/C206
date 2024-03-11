public class Arma {

    //atributos (características gerais da arma de cada habitante
    private String nomeArma;
    private boolean magica;

    //criando getters e setter para permitir mudar as caracteristicas da arma
    public String getNomeArma(){
        return nomeArma;

    }

    public void setNomeArma(String nomeArma){
        this.nomeArma = nomeArma;
    }

    public boolean isMagica(){
        return magica;
    }

    public void setMagica(boolean magica){
        this.magica = magica;
    }
}
