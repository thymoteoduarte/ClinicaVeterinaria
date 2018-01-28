package negocio.excecoes;

public class AnimalNaoCadastradoException extends Exception {
    public AnimalNaoCadastradoException () {
        super ("Animal não cadastrado !");
    }

    public void exibir() {
    }
}
