public abstract class RedeSocial {
    //atributos de rede social
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    //metodos de rede social
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.println("O usuário curtiu uma publicação!");
    }
}
