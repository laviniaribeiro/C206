public class Computador {
    //atributos do computador
    public String marca; //marca do computador
    public float preco; //preço do computador

    //agregação
    public MemoriaUSB memoria;
    Cliente [] cliente = new Cliente[10];

    //composição
    public SistemaOperacional SO = new SistemaOperacional();
    public HardwareBasico HB = new HardwareBasico();

    //construtor
    public Computador(String marca, float preco, String nomeSO, int tipoSO, String nomeHB, float capacidadeHB, MemoriaUSB memoria){

        this.marca = marca;
        this.preco = preco;
        this.SO.nome = nomeSO;
        this.SO.tipo = tipoSO;
        this.HB.nome = nomeHB;
        this.HB.capacidade = capacidadeHB;
        this.memoria = memoria;
    }

    //mostrando configurações do pc
    void mostraPCConfigs(){

        System.out.println("+++++++++ INFORMAÇÕES SOBRE O COMPUTADOR ++++++++++");
        System.out.println("Marca: " +marca);
        System.out.println("Preço: " +preco);
        System.out.println("---------- Sistema Operacional -----------");
        System.out.println("Nome: " +SO.nome);
        System.out.println("Tipo: " +SO.tipo);
        System.out.println("---------- Hardware Básico -----------");
        System.out.println("Nome: " +HB.nome);
        System.out.println("Capacidade: " +HB.capacidade);
        System.out.println("---------- Memória USB -----------");
        System.out.println("Nome: " +memoria.nome);
        System.out.println("Capacidade: " +memoria.capacidade);
    }

    //adicionando memoria USB
    public void addMemoriaUSB(MemoriaUSB memoria){

        this.memoria = memoria;
    }
}
