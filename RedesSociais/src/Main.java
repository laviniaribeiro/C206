public class Main {
    public static void main(String[] args) {


        //criando as redes sociais
        Facebook facebook = new Facebook("senhadofacebook", 400);

        GooglePlus google = new GooglePlus("senhadogoogle", 20);

        Twitter twitter = new Twitter("senhadotwitter", 600);

        Instagram instagram = new Instagram("senhadoinstagram", 2000);

        RedeSocial[] aux = new RedeSocial[10];

        aux[0] = facebook;
        aux[1] = twitter;


        //criando um usuário
        Usuario usuario = new Usuario(aux);
        usuario.setNome("nome do usuario");
        usuario.setEmail("usuario@gmail.com");


        Facebook auxface = (Facebook) usuario.redeSocial[0];
        auxface.fazStreaming();
        auxface.compartilhar();
        auxface.curtirPublicacao();
        System.out.println("*------------------*");
        usuario.redeSocial[1].postarComentario();
        usuario.redeSocial[1].postarVideo();
        usuario.redeSocial[1].postarFoto();

    }
}
