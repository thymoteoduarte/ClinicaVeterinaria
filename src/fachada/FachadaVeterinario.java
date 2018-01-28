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
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class FachadaVeterinario {
    private NegocioVeterinario veterinario;
    private NegocioCliente cliente;
    private NegocioRecepcionista recepcionista;

    public FachadaVeterinario(){
        this.veterinario = new NegocioVeterinario(new RepositorioVeterinarios());
        this.cliente = new NegocioCliente(new RepositorioClientes());
        this.recepcionista = new NegocioRecepcionista(new RepositorioRecepcionistas());
    }
    
    
    public void login(String login, String senha) throws LoginInvalidoException{
       this.veterinario.login(login, senha);
    }
    

    public void cadastrarRecepcionista(String nome, String sexo, String fone, LocalDate dn, Endereco end, String login, String senha){
        Recepcionista novo = new Recepcionista(nome, sexo, fone, dn, end, login, senha);
        try{
            this.recepcionista.addRecepcionista(novo);
        }catch(RecepcionistaJaCadastradoException e){
            e.exibir();
        }
    }

    public void cadastrarVeterinario(String nome, String sexo, String fone, LocalDate dn, Endereco end, String login, String senha){
        Veterinario novo = new Veterinario(nome, sexo, fone, dn, end, login, senha);
        try {
            this.veterinario.addVeterinario(novo);
        } catch (VeterinarioJaCadastradoException e) {
            e.exibir();
        }
    }

    public void finalizarAtendimento(String nomeVet, String obs, String nomeCliente, LocalDate dn, String nomeAnimal){
        try {
            Veterinario vet = this.veterinario.getVeterinario(nomeVet);
            Cliente cliente = this.cliente.getCliente(nomeCliente, dn);
            Animal animal = this.cliente.getAnimal(nomeCliente,dn,nomeAnimal);
            Consulta consulta = new Consulta(vet, animal, LocalDate.now());
            this.veterinario.encerrar(vet, consulta, obs);
            this.veterinario.atualizar(vet);
            this.cliente.atualizarAnimal(cliente, animal);

        } catch (AnimalNaoCadastradoException e) {
            e.exibir();
        } catch (ClienteNaoCadastradoException e) {
            e.exibir();
        } catch (VeterinarioNaoCadastradoExceptions e) {
            e.exibir();
        } catch (ConsultaJaEncerradaException e) {
            e.exibir();
        } catch (ConsultaNaoMarcadaException e) {
            e.exibir();
        }
    }


    public ArrayList<String> consultarHistorico(String nomeCliente, LocalDate dn, String nomeAnimal){
        try {
            Animal animal = this.cliente.getAnimal(nomeCliente, dn, nomeAnimal);
            ArrayList<String> informacoes = new ArrayList();

            for(Consulta consulta : animal.getHistorico()){
                informacoes.add(consulta.getHistorico());
            }

            return informacoes;

        } catch (AnimalNaoCadastradoException e) {
            e.printStackTrace();
        } catch (ClienteNaoCadastradoException e) {
            e.printStackTrace();
        }

        return null;
    }


    public ArrayList<String> consultarHorario(String nomeVet, LocalDate data) {
        try {
            ArrayList<Consulta> consultas = this.veterinario.getVeterinario(nomeVet).getConsultasMarcadas();
            ArrayList<String> consultasStr = new ArrayList();

            for (Consulta c : consultas) {
                if (c.getData().equals(data)) {
                    consultasStr.add(c.getAnimal().toString());
                }
                return consultasStr;
            }
        } catch (VeterinarioNaoCadastradoExceptions veterinarioNaoCadastradoExceptions) {
            veterinarioNaoCadastradoExceptions.printStackTrace();
        }
        return null;
    }

    public ArrayList<String> consultarHorario(String nomeVet) {
        try {
            ArrayList<Consulta> consultas = this.veterinario.getVeterinario(nomeVet).getConsultasMarcadas();
            ArrayList<String> consultasStr = new ArrayList();

            for (Consulta c : consultas) {
                consultasStr.add(c.getAnimal().toString());
            }
            return consultasStr;
        } catch (VeterinarioNaoCadastradoExceptions veterinarioNaoCadastradoExceptions) {
            veterinarioNaoCadastradoExceptions.printStackTrace();
        }
        return null;
    }
}