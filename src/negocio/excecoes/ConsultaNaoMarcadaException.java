package negocio.excecoes;

public class ConsultaNaoMarcadaException extends Exception {
	public ConsultaNaoMarcadaException(){
		super("Consulta n�o registrada no sistema !");
	}
}
