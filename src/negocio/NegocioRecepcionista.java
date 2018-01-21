package negocio;

import dados.clientes.RepositorioClientes;
import dados.funcionarios.RepositorioFuncionarios;
import negocio.entidades.Animal;
import negocio.entidades.pessoas.Cliente;
import negocio.excecoes.AnimalNaoCadastradoException;

public class NegocioRecepcionista {
    RepositorioClientes repositorioClientes;
    RepositorioFuncionarios repositorioFuncionarios;

    public void cadastrarAnimal (RepositorioFuncionarios repositorioFuncionarios, RepositorioClientes repositorioClientes) {
        this.repositorioClientes = repositorioClientes;
        this.repositorioFuncionarios = repositorioFuncionarios;
    }



    //Remove um animal do cadastro do cliente e atualiza o repositorio de clientes.
    public void removerAnimal (Cliente cliente, String especie, String nome, String raca) throws AnimalNaoCadastradoException {
        boolean ehDono = false;

        for (Animal animal : cliente.getListaAnimais()) {
            if(animal.getNome().equals(nome) && animal.getRaca().equals(raca) && animal.getEspecie().equals(especie)){
                cliente.removeAnimal(animal);
                ehDono = true;
            }
        }

        if (!ehDono) {
            throw new AnimalNaoCadastradoException();
        }else {
            repositorioClientes.atualizar(cliente);
        }
    }
}
