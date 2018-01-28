package negocio.excecoes;

//import gui.janelasMensagens.JanelaMensagem;

public class AnimalNaoCadastradoException extends Exception {
    public AnimalNaoCadastradoException () {
        super ("Animal nao cadastrado !");
    }

    public void exibir() {
    }
}
