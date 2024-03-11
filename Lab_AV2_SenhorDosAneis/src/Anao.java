public class Anao extends Habitante implements Mineracao {

    private float altura;
    private String reino;

    public void atacar(){
        System.out.println("O anao atacou");
        super.atacar();
    }

    public void mostraInfo(){
        System.out.println("------ INFORMAÇÕES DO ANÃO ------");
        //utilizando o super para conseguir aproveitar o mostraInfo de habitantes
        super.mostraInfo();
        //adicionando as particularidades do anao
        System.out.println("Altura: " +this.altura);
        System.out.println("Reino: " +this.reino);
    }

    //metodo implementado a partir da interface de mineração
    @Override
    public void minerar(){
        System.out.println("O anão esta minerando!");
    }

    //setters
    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setReino(String reino){
        this.reino = reino;
    }
}
