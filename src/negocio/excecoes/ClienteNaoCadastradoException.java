package negocio.excecoes;

public class ClienteNaoCadastradoException extends Exception {
    public ClienteNaoCadastradoException (){
        super ("Cliente não cadastrado!");
    }

    public void exibir() {
    }

}
