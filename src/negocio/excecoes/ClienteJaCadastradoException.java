package negocio.excecoes;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super("O cadastro já existe !");
    }
}
