package dados.clientes;

import negocio.entidades.pessoas.Cliente;
import java.util.ArrayList;

//As regras de negocio serão implementadas na classe NegocioCliente.
public class RepositorioClientes implements IRepositorioClientes {
    private ArrayList<Cliente> lista;


    /**
     * Construtor de RepositorioCLientes, inicia os atributos de cliente.
     */
    public RepositorioClientes () {
        this.lista = new ArrayList();
    }


    @Override
    public void adicionar(Cliente cliente) {
        this.lista.add(cliente);
    }

    @Override
    public void remover(Cliente cliente) {
        this.lista.remove(cliente);
    }

    @Override
    public void atualizar(Cliente cliente) {
        this.lista.set(lista.indexOf(cliente), cliente);
    }

    @Override
    public ArrayList<Cliente> getClientes() {
        return this.lista;
    }

    @Override
    public boolean exite(Cliente cliente) {
        if (lista.contains(cliente)){
            return true;
        }
        return false;
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }
}