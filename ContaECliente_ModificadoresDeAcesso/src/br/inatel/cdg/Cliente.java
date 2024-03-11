package br.inatel.cdg;

public class Cliente {

    //atributos do cliente
    private String nome; //nome do cliente
    private long cpf; //cpf do cliente privado

    //setter nome
    public void setNome(String nome) {

        this.nome = nome;
    }

    //setter cpf
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
