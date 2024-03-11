public class Zumbi extends Personagem implements Lutar, Infectar{

    //atributos do zumbi
    private int diasInfeccao;
    private boolean cego;

    //criando getters e setters
    public int getDiasInfeccao(){
        return diasInfeccao;
    }
    public void setDiasInfeccao(int diasInfeccao){
        this.diasInfeccao = diasInfeccao;
    }

    public boolean isCego() {
        return cego;
    }

    //metodos do zumbi
    public void transformacao(){
        if(diasInfeccao >= 2 && diasInfeccao <= 14){
            cego = false;
            System.out.println("Este zumbi é um Corredor!");
        }
        else if(diasInfeccao > 14 && diasInfeccao <= 365){
            cego = false;
            System.out.println("Este zumbi é um Perseguidor!");
        }
        else{
            cego = true;
            System.out.println("Este zumbi é um Estalador!");
        }
    }
    public void mostrarInfos(){
        System.out.println("---- INFORMAÇÕES DO ZUMBI ----");
        //usando o super para conseguir aproveitar o mostrarInfos de personagem
        super.mostrarInfos();
        //adicionando as particularidades do zumbi
        System.out.println("Dias de infecção: " +this.getDiasInfeccao());
        System.out.println("Cego: " +this.isCego());
    }

    @Override
    public void atacar(){
        System.out.println("O zumbi atacou!");
    }
    @Override
    public void defender() {
        System.out.println("O zumbi defendeu!");
    }
    @Override
    public void infectou() {
        System.out.println("O zumbi mordeu e infectou um Humano!");
    }
}
