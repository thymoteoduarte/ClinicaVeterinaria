package negocio.excecoes;

public class ConsultaJaEncerradaException extends Exception {
	public ConsultaJaEncerradaException() {
		super("Consulta ja foi encerrada !");
	}

    public void exibir() {
    }
}
