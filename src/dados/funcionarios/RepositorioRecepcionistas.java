package dados.funcionarios;

import negocio.entidades.pessoas.Recepcionista;

import java.util.ArrayList;

public class RepositorioRecepcionistas implements IRepositorioRecepcionistas{
    private ArrayList<Recepcionista> lista;

    public RepositorioRecepcionistas(){
        this.lista = new ArrayList();
    }
    

    @Override
    public void adicionar(Recepcionista recepcionista){
            this.lista.add(recepcionista);
    }

    @Override
    public void remover(Recepcionista recepcionista) {
            this.lista.remove(recepcionista);
    }

    @Override
    public void atualizar(Recepcionista recepcionista){
            this.lista.add(this.lista.indexOf(recepcionista),recepcionista);
    }

    @Override
    public ArrayList<Recepcionista> getRecepcionistas() {
        return this.lista;
    }

    @Override
    public boolean existe(Recepcionista recepcionista) {
        return this.lista.contains(recepcionista);
    }
}
