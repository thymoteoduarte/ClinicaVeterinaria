package negocio.excecoes;

public class ConsultaNaoMarcadaException extends Exception {
	public ConsultaNaoMarcadaException(){
		super("Consulta nao registrada no sistema !");
	}
}
