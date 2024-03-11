public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //atividades de o usuario realiza no google plus
    @Override
    public void postarFoto(){
        System.out.println("O usuário postou uma foto no Google Plus!");
    }
    @Override
    public void postarVideo(){
        System.out.println("O usuário postou um vídeo no Google Plus!");
    }
    @Override
    public void postarComentario(){
        System.out.println("O usuário fez um comentário no Google Plus!");
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("O usuário curtiu uma publicação no Google Plus!");
    }
    @Override
    public void fazStreaming(){
        System.out.println("O usuário fez um Streaming no Google Plus!");
    }
    @Override
    public void compartilhar(){
        System.out.println("O usuário compartilhou uma publicação no Google Plus!");
    }
}
