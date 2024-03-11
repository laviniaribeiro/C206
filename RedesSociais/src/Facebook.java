public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //atividades de o usuario realiza no facebook
    @Override
    public void postarFoto(){
        System.out.println("O usuário postou uma foto no Facebook!");
    }
    @Override
    public void postarVideo(){
        System.out.println("O usuário postou um vídeo no Facebook!");
    }
    @Override
    public void postarComentario(){
        System.out.println("O usuário fez um comentário no Facebook");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("O usuário curtiu uma publicação no Facebook!");
    }
    @Override
    public void fazStreaming(){
        System.out.println("O usuário fez um Streaming no Facebook!");
    }
    @Override
    public void compartilhar(){
        System.out.println("O usuário compartilhou uma publicação no Facebook!");
    }
}
