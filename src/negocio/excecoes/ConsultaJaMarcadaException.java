package negocio.excecoes;

public class ConsultaJaMarcadaException extends Exception {
	public ConsultaJaMarcadaException() {
		super("Consulta ja registrada no sistema !");
	}
}
