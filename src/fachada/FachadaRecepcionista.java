package fachada;

import dados.clientes.RepositorioClientes;
import gui.janelasCliente.JanelaCliente;
import gui.janelasFuncionarios.JanelaConsultasMarcadas;
import gui.janelasFuncionarios.JanelaRecepcionista;
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
    }



                                                                                                     //metodos para consulta de cadastros:


    //consulta toda a lista de clientes cadastrados no sistema
    public void consultarListaClientes(){
        ArrayList<String> listaDeCliente = new ArrayList();

        for(Cliente cliente : this.cliente.getRepositorioClientes().getClientes())
            listaDeCliente.add(cliente.getNome() + "          Data de Nascinmento: " + cliente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        new JanelaRecepcionista().exibirListaClientes(listaDeCliente);
    }

    //consulta o cadatro de um cliente atravez de seu nome
    public void consultarCadastroCliente(String nome, LocalDate data){
        try{
            Cliente c = this.cliente.getCliente(nome, data);
            JanelaCliente janelaCliente = new JanelaCliente();
            janelaCliente.exibirInformacoes(c.toString());
        }catch (ClienteNaoCadastradoException ex) {
            ex.exibir();
        }
    }

    //Exibe uma lista de animais do cliente
    public void consultarListaAnimais (String nomeCliente, LocalDate data) {
        try{
            Cliente c = this.cliente.getCliente(nomeCliente, data);
            ArrayList<String> informacoes = new ArrayList();
            JanelaCliente janelaCliente = new JanelaCliente();

            for(Animal animal : c.getListaAnimais()){
                informacoes.add(animal.getNome());
            }

            janelaCliente.exibirListaAnimais(c.getNome(),informacoes);
        }catch (ClienteNaoCadastradoException ex) {
            ex.exibir();
        }
    }

    //Exibe informações de um unico animal do cliente
    public void consultarAnimal(String nomeCliente, LocalDate dn, String nomeAnimal){
        try {
            Animal a = cliente.getAnimal(nomeCliente, dn, nomeAnimal);
            JanelaCliente janelaCliente = new JanelaCliente();

            janelaCliente.exibirInformacoes(nomeCliente, a.toString());

        }catch (ClienteNaoCadastradoException ex){
            ex.exibir();
        } catch (AnimalNaoCadastradoException ex) {
            ex.exibir();
        }
    }


                                                                                                    //metodos para consulta de horarios

    //Consulta as consultas marcadas para um veterinario para um data especifica
    public void consultarHorarios(String nomeVet, LocalDate data) {
        try {
            Veterinario vet = this.veterinario.getVeterinario(nomeVet);
            ArrayList<String> listaDeConsultas = new ArrayList();
            JanelaConsultasMarcadas janela = new JanelaConsultasMarcadas();

            for(Consulta consulta : vet.getConsultasMarcadas()){
                if(consulta.getData().equals(data))
                    listaDeConsultas.add(consulta.toString());
            }

            janela.exibir(listaDeConsultas);
        }catch(VeterinarioNaoCadastradoExceptions ex){
            ex.exibir();
        }
    }

                                                                                                            //metodos de cadastros


    //Cadastra um cliente no sistema
    public void cadastrarCliente(String nome, String sexo, String fone, LocalDate data, Endereco end){
        Cliente novo = new Cliente(nome, sexo, fone, data, end);

        try{
            cliente.novoCadastro(novo);
        }catch (ClienteJaCadastradoException ex){
            ex.exibir();
        }

    }

    //Vincula um animal a um cliente já cadastrado no sistema
    public void cadastrarAnimal(String nomeCliente, LocalDate dn, String nomeAnimal, String sexo, String especie, String raca, LocalDate dnAnimal){
        try {
            Cliente c = cliente.getCliente(nomeCliente, dn);
            Animal novo = new Animal(nomeAnimal, sexo, especie, raca, dnAnimal);

            cliente.cadastrarAnimal(c, novo);
        }catch (ClienteNaoCadastradoException ex) {
            ex.exibir();
        } catch (AnimalJaCadastradoException ex) {
            ex.exibir();
        }
    }


                                                                                                    //metodos de agendamento de consultas

    //Agenda uma consulta para um animal, em uma data especifia
    public void marcarConsulta(String nomeVet, String nomeCliente, LocalDate dn, String nomeAnimmal, LocalDate data){
        try {
            Animal animal = this.cliente.getAnimal(nomeCliente, dn, nomeAnimmal);
            Veterinario vet = this.veterinario.getVeterinario(nomeVet);
            Consulta consulta = new Consulta(vet, animal, data);

            animal.setConsulta(consulta);
            vet.preencherVaga(consulta);
            //atualizar os repositorios
        } catch (ClienteNaoCadastradoException e) {
            e.exibir();
        } catch (AnimalNaoCadastradoException e) {
            e.exibir();
        } catch (VeterinarioNaoCadastradoExceptions e) {
            e.exibir();
        }
    }


    //Desmarca uma consulta
    public void desmarcarConsulta(String nomeVet, String nomeCliente, LocalDate dn, String nomeAnimal, LocalDate data){
        try {
            Veterinario vet = veterinario.getVeterinario(nomeVet);
            Animal a = cliente.getAnimal(nomeCliente, dn, nomeAnimal);
            Consulta consulta = new Consulta(vet, a,data);

            vet.desmarcar(consulta);
            a.removerConsulta(consulta);

            //atualizar os repositorios
        } catch (VeterinarioNaoCadastradoExceptions e) {
            e.exibir();
        } catch (ClienteNaoCadastradoException e) {
            e.exibir();
        } catch (AnimalNaoCadastradoException e) {
            e.exibir();
        } catch (ConsultaNaoMarcadaException e) {
            e.printStackTrace();
        }

    }

















}
