public class Humano extends Personagem implements Aprimorar, Lutar{

    //atributos de humano
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    Arma arma; //humano pode ter uma arma

    //metodos de humano
    public void mostrarInfos(){
        System.out.println("\n");
        System.out.println("----- INFORMAÇÕES DO HUMANO -----");
        //utilizando o super para aproveitar mostraInfo de personagem
        super.mostrarInfos();
        //adicionando as particulariades do humano
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Distância de escuta: " +this.distanciaEscuta);
    }
    public void addArma(Arma arma){
        this.arma = arma;
        if(arma == null)
            System.out.println("Arma não adicionada ao humano");
        else{
            System.out.println("\n");
            System.out.println("---- INFORMAÇÕES DA ARMA ----");
            System.out.println("Nome da arma: " +arma.getTipoArma());
            System.out.println("Força da arma: " +arma.getForca());
        }
    }

    //criando getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean isVagalume() {
        return vagalume;
    }
    public double getEnergia(){
        return energia;
    }
    public void setEnergia(double energia){
        this.energia = energia;
    }
    public double getDistanciaEscuta(){
        return distanciaEscuta;
    }
    public void setDistanciaEscuta(double distanciaEscuta){
        this.distanciaEscuta = distanciaEscuta;
    }

    @Override
    public void modificarArma(){
        int forca = arma.getForca(); //recuperando a quantidade de força atual da arma
        forca += 5; //adicionando 5 pontos na força da arma
        arma.setForca(forca); //setanfo a nova força da arma
        System.out.println("---- INFORMAÇÕES DA ARMA MODIFICADA ----");
        System.out.println("Nome da arma: " +arma.getTipoArma());
        System.out.println("Força modificada: " +arma.getForca());
    }
    @Override
    public void modificarHabilidade(int qtdPilulas, String tipoHabilidade){
        if(qtdPilulas <= 0)
            System.out.println("Quantidade de pílulas inválidas, favor informar um valor maior que 0.");
        if(tipoHabilidade.equalsIgnoreCase("Energia")){
            if(qtdPilulas > 0 && qtdPilulas <= 10 ){
                double energia = this.getEnergia(); //recuperando a energia atual do humano
                energia = (double)(energia + (energia*0.02)); //modificando a energia atual
                this.setEnergia(energia); //setando a nova energia do humano
                System.out.println("A energia está sendo aumentada em 2%");
                System.out.println("Energia atual: " +this.getEnergia());
            }
            else if(qtdPilulas > 10 && qtdPilulas <= 15){
                double energia = this.getEnergia(); //recuperando a energia atual do humano
                energia = (double)(energia + (energia*0.04)); //modificando a energia atual
                this.setEnergia(energia); //setando a nova energia do humano
                System.out.println("A energia está sendo aumentada em 4%");
                System.out.println("Energia atual: " +this.getEnergia());
            }
        }
        else if(tipoHabilidade.equalsIgnoreCase("Escuta")){
            if(qtdPilulas > 0 && qtdPilulas <= 10 ){
                double escuta = this.getDistanciaEscuta(); //recuperando a distancia de escuta atual do humano
                escuta = (double)(escuta + (escuta*0.2)); //modificando a distancia de escuta atual
                this.setDistanciaEscuta(escuta); //setando a nova distancia de escuta do humano
                System.out.println("A distância de escuta está sendo aumentada em 0.2");
                System.out.println("Distância de escuta atual: " +this.getDistanciaEscuta());
            }
            else if(qtdPilulas > 10 && qtdPilulas <= 15){
                double escuta = this.getDistanciaEscuta(); //recuperando a distancia de escuta atual do humano
                escuta = (double)(escuta + (escuta*0.5)); //modificando a distancia de escuta atual
                this.setDistanciaEscuta(escuta); //setando a nova distancia de escuta do humano
                System.out.println("A distância de escuta está sendo aumentada em 0.5");
                System.out.println("Distância de escuta atual: " +this.getDistanciaEscuta());
            }
        }
    }

    @Override
    public void atacar(){
        System.out.println(this.getNome() +" está atacando com a arma " +this.arma.getTipoArma() +" de força " +this.arma.getForca());
    }
    @Override
    public void defender(){
        System.out.println(this.getNome() +" está se defendendo");
    }
}
