public class Mago extends Habitante implements Cura,Feitico{

    //atributos de um mago
    public String cor;

    //metodos reescritos da classe mae (Habitante) - Polimorfismo
    @Override
    public void atacar(){
        System.out.println("O mago atacou!");
        super.atacar();
    }
    public void mostraInfo(){
        System.out.println("----- INFORMAÇÕES DO MAGO -----");
        //usando o super para conseguir aproveitar monstraInfo de habitantes
        super.mostraInfo();
        //adicionando as particularidades do mago
        System.out.println("Cor: " +this.cor);
    }

    //metodos implementados a partir das classes
    @Override
    public void curar(){
        float energia = this.getEnergia(); //recuperando a energia atual do heroi
        energia = (float) (energia + (energia*0.15)); //modificando a energia atual do heroi
        this.setEnergia(energia); //setando nova energia para o heroi
        System.out.println("O heroi foi curado!");
        System.out.println("Energia apos a cura: " +this.getEnergia());
    }

    @Override
    public void lancarFeitico(){
        float energia = this.getEnergia(); //recuperando a energia atual do heroi
        energia = (float) (energia - (energia*0.1)); //modificando a energia atual do heroi
        this.setEnergia(energia); //setando a nova energia para o heroi
        System.out.println("O mago lançou um feitiço"); //informando que o mago lançou um feitiço
        System.out.println("Sua energia atual: " +this.getEnergia());
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
