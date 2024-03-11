public class Usuario {
    //atributos do usuario
    private String nome;
    private String email;

    //atribuindo variavel redeSocial
    RedeSocial[] redeSocial = new RedeSocial[10];

    //construtor de usuario (criando array para redes sociais)
    public Usuario(RedeSocial[] redeSocial) {
        this.redeSocial = redeSocial;

        for (int i = 0; i < this.redeSocial.length; i++) {

            if(redeSocial[i] instanceof Facebook){
                System.out.println("Usuario cadastrado no facebook!");
                System.out.println("*------------------*");
            }
            if(redeSocial[i] instanceof Twitter){
                System.out.println("Usuario cadastrado no twitter!");
                System.out.println("*------------------*");
            }
            if(redeSocial[i] instanceof GooglePlus){
                System.out.println("Usuario cadastrado no google plus!");
                System.out.println("*------------------*");
            }
            if(redeSocial[i] instanceof Instagram){
                System.out.println("Usuario cadastrado no instagram!");
                System.out.println("*------------------*");
            }

        }

    }


    //criando getter e setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

