public class Elfo extends Habitante implements Cura{
     //atributos extras de um elfo
    private String tribo;

    //metodos do elfo
    public void viajar(){
        System.out.println("O elfo esta viajando!");
    }

    //metodos reescritos na classe mãe (Habitante)
    @Override
    public void atacar(){
        System.out.println("O elfo atacou!");
        super.atacar();
    }
    public void mostraInfo(){
        System.out.println("----- INFORMAÇÕES DO ELFO -----");
        //usando o super para conseguir aproveirar mostraInfo de habitante
        super.mostraInfo();
        //adicionando as particularidades do elfo
        System.out.println("Tribo: " +this.tribo);
    }

    //metodo implementado da partir da interface de cura
    @Override
    public void curar(){
        float energia = this.getEnergia(); //recuperando a energia atual do heroi
        energia = (float) (energia + (energia*0.15)); //modificando a energia atual do heroi
        this.setEnergia(energia); //setando a nova energia para o heroi
        System.out.println("O heroi foi curado"); //informando que o heroi foi curado
        System.out.println("Energia apos a cura: " +this.getEnergia());
    }

    public void setTribo(String tribo){
        this.tribo = tribo;
    }
}
