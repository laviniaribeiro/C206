public class Cliente {
    //atributos do cliente
    public String nome; //nome do cliente
    public long cpf; //CPF do cliente

    //construtor
    public Cliente(String nome, long cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    //calculando o total da compra
    public float calculaTotalCompra(float total, float valor){

        total = total + valor;
        return total;
    }
}
