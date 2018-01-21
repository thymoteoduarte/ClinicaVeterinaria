package negocio.excecoes;

public class FuncionarioNaoCadastradoException extends Exception{
    public FuncionarioNaoCadastradoException () {
        super("Este funcionário não está cadastrado no sistema");
    }

    public FuncionarioNaoCadastradoException (String mensagem) {
        super(mensagem);
    }
}
