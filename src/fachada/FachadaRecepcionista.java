package fachada;

import dados.clientes.RepositorioClientes;
import negocio.NegocioCliente;
import negocio.entidades.Animal;
import negocio.entidades.pessoas.Cliente;
import negocio.entidades.pessoas.Endereco;
import negocio.excecoes.AnimalJaCadastradoException;
import negocio.excecoes.ClienteJaCadastradoException;
import negocio.excecoes.ClienteNaoCadastradoException;

import java.time.LocalDate;

public class FachadaRecepcionista {
    private NegocioCliente cliente;

    public FachadaRecepcionista() {
        this.cliente = new NegocioCliente(new RepositorioClientes());                       //este repositorio pode ser dcarregado de um arquivo
    }

    //Cadastra um cliente no sistema
    public void cadastrarCliente(String nome, String sexo, String fone, LocalDate data, Endereco end){
        Cliente novo = new Cliente(nome, sexo, fone, data, end);

        try{
            cliente.novoCadastro(novo);
        }catch (ClienteJaCadastradoException ex){
            //exibir mensagem de erro.
        }

    }


    //Vincula um animal a um cliente já cadastrado no sistema
    public void cadastrarAnimal(String nomeCliente, LocalDate dn, String nomeAnimal, String sexo, String especie, String raca, LocalDate dnAnimal){
        try {
            Cliente c = cliente.getCliente(nomeCliente, dn);
            Animal novo = new Animal(nomeAnimal, sexo, especie, raca, dnAnimal);

            cliente.cadastrarAnimal(c, novo);
        }catch (ClienteNaoCadastradoException ex) {
            //exibir a mensagem de erro.
        } catch (AnimalJaCadastradoException e) {
            //exibir a mensagem de erro.
        }
    }


    public void listarInformacoes(){
        for(Cliente c : this.cliente.getRepositorioClientes().getLista()){
            System.out.println("-------------" + c.getNome() +"-------------\n-------------" + c.getDataNascimento().toString() + "-------------");
            for(Animal animal : c.getListaAnimais()){
                System.out.println(animal.getNome() + "\n" + animal.getEspecie());
            }
        }

    }

    public void marcarConsulta(String nomeCliente, LocalDate dn, String nomeAnimal){

    }
}
