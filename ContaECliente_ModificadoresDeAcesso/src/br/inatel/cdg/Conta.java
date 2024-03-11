package br.inatel.cdg;

public class Conta {

    //atributos da conta
    private int numero; //numero da conta
    private float saldo; //saldo da conta
    private float limite; //limite da conta

     public Cliente cliente; //dono da conta

    public Conta(){
        cliente = new Cliente();
    }

    //getter do numero da conta
    public int getNumero() {

        return numero;
    }

    //getter do saldo
    public float getSaldo() {

        return saldo;
    }

    //getter do limite
    public float getLimite() {
        return limite;
    }

    //metodos da conta
    public void sacar(float quantia){
        if(this.saldo>quantia){
            this.saldo -= quantia;
        }
    }

    public void deposita(float quantia){

        this.saldo += quantia;
    }
}
