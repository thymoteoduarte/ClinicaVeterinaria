package negocio.excecoes;

public class ConsultaNaoMarcadaException extends Exception {
	public ConsultaNaoMarcadaException(){
		super("Consulta não registrada no sistema !");
	}
}
