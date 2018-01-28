package negocio.excecoes;

public class LoginInvalidoException extends Exception {
	public LoginInvalidoException() {
		super("Login Invalido !");
	}

    public void exibir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
