package negocio.excecoes;

public class ConsultaJaMarcadaException extends Exception {
	public ConsultaJaMarcadaException() {
		super("Consulta j� registrada no sistema !");
	}

    public void exibir() {
    }
}
