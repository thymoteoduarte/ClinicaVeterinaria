package negocio.excecoes;

import gui.janelasMensagens.JanelaMensagem;

public class ClienteNaoCadastradoException extends Exception {
    public ClienteNaoCadastradoException (){
        super ("Cliente não cadastrado!");
    }

    public void exibir() {
        JanelaMensagem janela = new JanelaMensagem(this);
    }

}
