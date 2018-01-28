package negocio.excecoes;

public class ConsultaJaMarcadaException extends Exception {
	public ConsultaJaMarcadaException() {

		super("Consulta ja registrada no sistema !");

	//	super("Consulta j� registrada no sistema !");
// 83329b91b24f8cf63be55ebdacdeabcb24bb7fd7
	}

    public void exibir() {
    }
}
