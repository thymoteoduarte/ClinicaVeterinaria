package dados.clientes;

import negocio.entidades.pessoas.Cliente;

import java.util.ArrayList;

public interface IRepositorioClientes {
    void adicionar(Cliente cliente);
    void remover(Cliente cliente);
    void atualizar(Cliente cliente);
    ArrayList<Cliente> getClientes();
    boolean exite(Cliente cliente);

}
