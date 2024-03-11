public class Arma {

    //atributos da arma
    private int forca;
    private String tipoArma;

    //metodos de arma
    public void mostrarInfos(){
        System.out.println("\n");
        System.out.println("Força: " +this.forca);
        System.out.println("Tipo da arma: " +this.tipoArma);
    }

    //criando getters e setters
    public int getForca(){
        return forca;
    }
    public void setForca(int forca){
        this.forca = forca;
    }
    public String getTipoArma(){
        return tipoArma;
    }
    public void setTipoArma(String tipoArma){
        this.tipoArma = tipoArma;
    }
}
