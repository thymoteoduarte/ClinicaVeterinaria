package fachada;

import dados.clientes.RepositorioClientes;
import dados.funcionarios.RepositorioRecepcionistas;
import dados.funcionarios.RepositorioVeterinarios;
import negocio.NegocioCliente;
import negocio.NegocioRecepcionista;
import negocio.NegocioVeterinario;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Cliente;
import negocio.entidades.pessoas.Endereco;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class FachadaRecepcionista {

    private NegocioCliente cliente;
    private NegocioRecepcionista recepcionista;
    private NegocioVeterinario veterinario;

    public FachadaRecepcionista() {
        this.cliente = new NegocioCliente(new RepositorioClientes());  //este repositorio pode ser carregado de um arquivo
        this.veterinario = new NegocioVeterinario(new RepositorioVeterinarios());
        this.recepcionista = new NegocioRecepcionista(new RepositorioRecepcionistas());
    }

    public void login(String login, String senha) throws LoginInvalidoException {
        this.recepcionista.login(login, senha);
    }

                                                                //metodos para consulta de cadastros:
    
    
    //consulta toda a lista de clientes cadastrados no sistema
    public ArrayList<String> consultarListaClientes() {
        ArrayList<String> listaDeCliente = new ArrayList();

        for (Cliente c : this.cliente.getRepositorioClientes().getClientes()) {
            listaDeCliente.add(c.getNome() + "               Data de Nascinmento: " + c.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }

        return listaDeCliente;
    }

    //consulta o cadatro de um cliente atravez de seu nome
    public String consultarCadastroCliente(String nome, LocalDate data) throws ClienteNaoCadastradoException {
        Cliente c = this.cliente.getCliente(nome, data);
        return c.toString();

    }

    //Exibe uma lista de animais do cliente
    public ArrayList<String> consultarListaAnimais(String nomeCliente, LocalDate data) throws ClienteNaoCadastradoException {
        Cliente c = this.cliente.getCliente(nomeCliente, data);
        ArrayList<String> informacoes = new ArrayList();

        for (Animal animal : c.getListaAnimais()) {
            informacoes.add(animal.getNome());
        }

        return informacoes;

    }

    //Exibe informações de um unico animal do cliente
    public String consultarCadastroAnimal(String nomeCliente, LocalDate dn, String nomeAnimal) throws ClienteNaoCadastradoException, AnimalNaoCadastradoException {
        Animal a = cliente.getAnimal(nomeCliente, dn, nomeAnimal);
        return a.toString();
    }
    
    //retorna true se o cliente está cadastrado no sistema
    public boolean cadastrado(String nome, LocalDate data){
        try{
            this.cliente.getCliente(nome, data);
            return true;
        }catch(ClienteNaoCadastradoException e){
            return false;
        }
    }

                                                                //metodos para consulta de horarios
    
    
    //Consulta as consultas marcadas para um veterinario para um data especifica
    public ArrayList<String> consultarHorarios(String nomeVet, LocalDate data) throws VeterinarioNaoCadastradoExceptions {
        Veterinario vet = this.veterinario.getVeterinario(nomeVet);
        ArrayList<String> listaDeConsultas = new ArrayList();

        for (Consulta consulta : vet.getConsultasMarcadas()) {
            if (consulta.getData().equals(data)) {
                listaDeConsultas.add(consulta.toString());
            }
        }
        return listaDeConsultas;
    }

                                                                    //metodos de cadastros
    
    
    //Cadastra um cliente no sistema
    public void cadastrarCliente(String nome, String sexo, String fone, LocalDate data, Endereco end) throws ClienteJaCadastradoException {
        Cliente novo = new Cliente(nome, sexo, fone, data, end);
        cliente.novoCadastro(novo);
    }

    public void removerCliente(String nomeCliente, LocalDate dn) throws ClienteNaoCadastradoException{
        Cliente c = this.cliente.getCliente(nomeCliente, dn);
        this.cliente.removerCliente(c);
    }

    //Vincula um animal a um cliente já cadastrado no sistema
    public void cadastrarAnimal(String nomeCliente, LocalDate dn, 
            String nomeAnimal, String sexo, String especie, String raca, LocalDate dnAnimal) 
            throws ClienteNaoCadastradoException, AnimalJaCadastradoException{
        
        Cliente c = cliente.getCliente(nomeCliente, dn);
        Animal novo = new Animal(nomeAnimal, sexo, especie, raca, dnAnimal, c);

        this.cliente.cadastrarAnimal(c, novo);

    }

    //retira um animal do cadastro do cliente
    public void removerAnimal(String nomeCliente, LocalDate dn, String nomeAnimal) throws ClienteNaoCadastradoException, AnimalNaoCadastradoException{
        Cliente c = this.cliente.getCliente(nomeCliente, dn);
        Animal a = this.cliente.getAnimal(nomeCliente, dn, nomeAnimal);
        this.cliente.removerAnimal(c, a);
    }

                                                            //metodos de agendamento de consultas
    
    
    //Agenda uma consulta para um animal, em uma data especifia
    public void marcarConsulta(String nomeVet, String nomeCliente, LocalDate dn, String nomeAnimmal, LocalDate data) 
            throws ClienteNaoCadastradoException, AnimalNaoCadastradoException, 
            ConsultaJaMarcadaException, VeterinarioNaoCadastradoExceptions{
        
            Animal animal = this.cliente.getAnimal(nomeCliente, dn, nomeAnimmal);
            Veterinario vet = this.veterinario.getVeterinario(nomeVet);

            this.recepcionista.marcarConsulta(animal, vet, data);
    }

    //Desmarca uma consulta
    public void desmarcarConsulta(String nomeVet, String nomeCliente, LocalDate dn, String nomeAnimal, LocalDate data)
            throws VeterinarioNaoCadastradoExceptions, ClienteNaoCadastradoException, AnimalNaoCadastradoException, ConsultaNaoMarcadaException {

        Veterinario vet = veterinario.getVeterinario(nomeVet);
        Animal a = cliente.getAnimal(nomeCliente, dn, nomeAnimal);
        Consulta consulta = new Consulta(vet, a, data);

        this.recepcionista.desmarcar(consulta, vet);
    }
}