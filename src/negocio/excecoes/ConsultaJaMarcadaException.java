package negocio.excecoes;

public class ConsultaJaMarcadaException extends Exception {
	public ConsultaJaMarcadaException() {
		super("Consulta já registrada no sistema !");
	}
}
