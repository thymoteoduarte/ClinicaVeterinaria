package negocio.excecoes;

public class ConsultaJaEncerradaException extends Exception {
	public ConsultaJaEncerradaException() {
		super("Consulta j� foi encerrada !");
	}
}
