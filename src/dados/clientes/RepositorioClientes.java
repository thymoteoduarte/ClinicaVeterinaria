package dados.clientes;

import negocio.entidades.pessoas.Cliente;
import negocio.excecoes.ClienteNaoCadastradoException;

import java.time.LocalDate;
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

    //metodo auxiliar para resgatar um cliente atravez do seu nome e data de nascimento
    public Cliente getCliente (String nome, LocalDate data) throws ClienteNaoCadastradoException {
        for (Cliente cliente : lista){
            if(cliente.getNome().equals(nome) && cliente.getDataNascimento().equals(data)){
                return cliente;
            }
        }
        throw new ClienteNaoCadastradoException();
    }
}