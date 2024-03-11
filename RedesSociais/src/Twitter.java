public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //atividades de o usuario realiza no twitter
    @Override
    public void postarFoto(){
        System.out.println("O usuário postou uma foto no Twitter!");
    }
    @Override
    public void postarVideo(){
        System.out.println("O usuário postou um vídeo no Twitter!");
    }
    @Override
    public void postarComentario(){
        System.out.println("O usuário fez um comentário no Twitter!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("O usuário curtiu uma publicação no Twitter!");
    }
    @Override
    public void compartilhar(){
        System.out.println("O usuário compartilhou uma publicação no Twitter!");
    }
}
