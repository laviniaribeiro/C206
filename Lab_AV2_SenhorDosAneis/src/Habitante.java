public abstract class Habitante {

    //atributos dos habitantes
    public static int contador = 0; //inicialmente contador recebe 0
    private int id;
    private String nome;
    private int idade;
    private float energia;

    //realizando agregação
    Arma arma; //habitante pode ter uma arma ou nao

    //criando construtor da classe habitante
    Habitante(){
        this.contador++;
        this.id = contador;
    }

    //metodos gerais dos habitantes
    public void atacar(){
        if(this.arma == null)
            System.out.println("Arma não adicionada para o herói");
        else{

            System.out.println("+++++++ Informações da arma +++++++");
            System.out.println("Nome: " +arma.getNomeArma());
            System.out.println("Magica: " +arma.isMagica());

            if(arma.isMagica()){
                System.out.println("ATAQUE COM ARMA MÁGICA");
                this.energia = this.energia - 20;
                System.out.println("Energia após o ataque : " +this.energia);
            }
            else{
                System.out.println("ATAQUE COM ARMA NORMAL");
                this.energia = this.energia - 10;
                System.out.println("Energia após o ataque: " + this.energia);
            }
        }
    }

    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("Id: " +this.id);
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Energia: " +this.energia);
    }

    //criando getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public float getEnergia(){
        return energia;
    }
    public void setEnergia(float energia){
        this.energia = energia;
    }
}
