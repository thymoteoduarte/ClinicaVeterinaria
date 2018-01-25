package negocio;

import dados.clientes.RepositorioClientes;
import negocio.entidades.Animal;
import negocio.entidades.pessoas.Cliente;
import negocio.excecoes.AnimalJaCadastradoException;
import negocio.excecoes.AnimalNaoCadastradoException;
import negocio.excecoes.ClienteJaCadastradoException;
import negocio.excecoes.ClienteNaoCadastradoException;

import java.time.LocalDate;

public class NegocioCliente {
    RepositorioClientes repositorioClientes;

    public NegocioCliente(RepositorioClientes repositorioClientes) {
        this.repositorioClientes = repositorioClientes;
    }

    //cadastra um cliente no sistema
    public void novoCadastro(Cliente cliente) throws ClienteJaCadastradoException {
        if(!repositorioClientes.exite(cliente))
            repositorioClientes.adicionar(cliente);
        else
            throw new ClienteJaCadastradoException();
    }


    //Verifica se o cliente existe;
    //Verifica se o animal já está vinculado ao cliente;
    //Vincula um animal ao cliente;
    //Atualiza o repositorio de clientes.
    public void cadastrarAnimal(Cliente cliente, Animal animal) throws ClienteNaoCadastradoException, AnimalJaCadastradoException {
        if(repositorioClientes.exite(cliente)) {
            if(!cliente.ehDono(animal)){
                cliente.setAnimal(animal);
                this.repositorioClientes.atualizar(cliente);
            }else
                throw new AnimalJaCadastradoException();

        }else{
            throw new ClienteNaoCadastradoException();
        }
    }

    //Verifica se o animal está vinculado ao cliente;
    //Remove um animal do cadastro do cliente;
    //Atualiza o repositorio de clientes.
    public void removerAnimal (Cliente cliente, Animal animal) throws AnimalNaoCadastradoException, ClienteNaoCadastradoException {
        if (this.repositorioClientes.exite(cliente)) {
           if(cliente.ehDono(animal)) {
               cliente.removeAnimal(animal);
               repositorioClientes.atualizar(cliente);
           }else
               throw new AnimalNaoCadastradoException();
        }else
            throw new ClienteNaoCadastradoException();
    }

    //metodo auxiliar para resgatar um cliente atravez do seu nome e data de nascimento
    public Cliente getCliente (String nome, LocalDate data) throws ClienteNaoCadastradoException {
        for (Cliente cliente : this.repositorioClientes.getLista()){
            if(cliente.getNome().equals(nome) && cliente.getDataNascimento().equals(data)){
                return cliente;
            }
        }
        throw new ClienteNaoCadastradoException();
    }


    //Verifica se o cliente está cadastrado no sistema;
    //Verifica se existe algum animal com o nome passado como parametro que esteja vinculado ao cliente;
    //retorna o animal;
    public Animal getAnimal(String nomeCliente, LocalDate dn, String nomeAnimal) throws AnimalNaoCadastradoException, ClienteNaoCadastradoException {
        if(this.repositorioClientes.exite(this.getCliente(nomeCliente, dn) )){
            Cliente c = this.getCliente(nomeCliente, dn);
            for(Animal animal : c.getListaAnimais()){
                if(animal.getNome().equals(nomeAnimal)){
                    return animal;
                }
            }
            throw new AnimalNaoCadastradoException();
        } else
            throw new ClienteNaoCadastradoException();
    }


    public RepositorioClientes getRepositorioClientes() {
        return repositorioClientes;
    }
}
