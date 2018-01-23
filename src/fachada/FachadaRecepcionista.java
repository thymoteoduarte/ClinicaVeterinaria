package fachada;

import dados.clientes.RepositorioClientes;
import gui.janelasCliente.JanelaCliente;
import gui.janelasFuncionarios.JanelaConsultasMarcadas;
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
import java.util.ArrayList;

public class FachadaRecepcionista {
    private NegocioCliente cliente;
    private NegocioRecepcionista recepcionista;
    private NegocioVeterinario veterinario;

    public FachadaRecepcionista() {
        this.cliente = new NegocioCliente(new RepositorioClientes());                       //este repositorio pode ser dcarregado de um arquivo
    }



                                                                                                //metodos para consulta de cadastros:

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

            janelaCliente.exibirInformacoes(c.getNome(),informacoes);
        }catch (ClienteNaoCadastradoException ex) {
            ex.exibir();
        }
    }

    //Exibe informações de um unico animal do cliente
    public void consultarAnimal(String nomeCliente, LocalDate dn, String nomeAnimal){
        try {
            Cliente c = this.cliente.getCliente(nomeCliente, dn);
            Animal a = c.getAnimal(nomeAnimal);
            JanelaCliente janelaCliente = new JanelaCliente();

            janelaCliente.exibirInformacoes(c.getNome(), a.toString());

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


    //Recebe os dados do veterinario do animal e a data da consulta
    public void marcarConsulta(String nomeCliente, LocalDate dn, String nomeAnimal, String nomeVet, LocalDate data){
        try {
            Cliente c = this.cliente.getCliente(nomeCliente, dn);
            Animal a = c.getAnimal(nomeAnimal);
            this.recepcionista.marcarConsulta(a, this.veterinario.getVeterinario(nomeVet),data);
        }catch(ClienteNaoCadastradoException ex){
            //exibir a mensagem !
        }catch (AnimalNaoCadastradoException ex) {
            //exibir mensagem !
        }catch (VeterinarioNaoCadastradoExceptions ex){
            //exibir mensagem !
        }catch (ConsultaJaMarcadaException ex) {
            //exibir mensagem !
        }
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






















}
