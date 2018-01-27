package negocio.excecoes;

import gui.JanelaMensagem;

public class ClienteNaoCadastradoException extends Exception {
    public ClienteNaoCadastradoException (){
        super ("Cliente não cadastrado!");
    }

    public void exibir() {
        JanelaMensagem janela = new JanelaMensagem(this);
    }

}
