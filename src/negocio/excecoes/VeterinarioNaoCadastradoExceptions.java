package negocio.excecoes;

public class VeterinarioNaoCadastradoExceptions extends Exception {
    public VeterinarioNaoCadastradoExceptions(){
        super ("Veterinario nao cadastrado !");
    }

    public void exibir() {
    }
}
