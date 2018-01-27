package negocio.excecoes;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super("O cadastro ja existe !");
    }

    public void exibir() {
    }
}
