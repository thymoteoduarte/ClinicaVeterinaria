package negocio.excecoes;

public class AnimalJaCadastradoException extends Exception {
    public AnimalJaCadastradoException(){
        super("Animal já está vinculado ao cliente !");
    }
}
