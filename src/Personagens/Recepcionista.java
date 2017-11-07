package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;
import java.util.ArrayList;


public class Recepcionista extends Funcionario{
    String login, senha;

    public Recepcionista(String nome, int idade, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, sexo, telefone, dataNascimento, endereco, login, senha);
    }


                                                    //Metodos Herdados:
    @Override
    public void FazerLogin() {
        //inicialização do sistema para um Recepcionista
    }

    @Override
    public void cadastrar(Repositorios repositorio) {
        //incluir o recepcionista no repositório de recepcionistas
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
                                                    //Metodos de Funcionário:


    /**
     * Recebe os dados de um novo cliente, e o coloca no repositório de clientes
     */
    public void cadastrarCliente(){

    }

    /**
     * Cadastra um animal de um cliente, e o coloca no repositório de Animais
     */
    public void cadastrarAnimal(){


    }

    /**
     * Reserva o horário de um veterinario para a consulta ou cirurgia de um animal.
     * @param veterinario
     * @param paciente
     */
    public void marcarConsulta(Veterinario veterinario, Animal paciente){


    }

    /**
     * Deixa livre um horário do Veterinário.
     * @param funcionario
     * @param animal
     */
    public void desmarcarConsulta(Veterinario funcionario, Animal animal){


    }

    /**
     * Reserva uma vaga para o hotelzinho.
     */
    public void reservarVaga(){


    }

    /**
     * Deixa livre uma vaga do hotelzinho.
     */
    public void cancelarVaga(){


    }

    /**
     * Marca um horário para a vacina de um animal.
     */
    public void masrcarVacina(){

    }


    /**
     * Cancela a marcação de uma vacinação de um animal
     */
    public void desmarcarVacina(){

    }



                                                                    //implementar a consulta de horários:
    /**
     * Retorna um ArrayList contendo os horários dos Veterinários.
     * @return
     */
    public ArrayList consultarHorariosVet(){
        return new ArrayList();
    }

    /**
     * Retorna um ArrayList contendo os horários de um Veterinários específico.
     * @return
     */
    public ArrayList consultarHorariosVet(Veterinario vet){
        return new ArrayList();
    }

    /**
     * Retorna um ArrayList contendo os horários dos Tecnicos Veterinários.
     * @return
     */
    public ArrayList consultarHorariosTecVet(){
        return new ArrayList();
    }

    /**
     * Retorna um ArrayList contendo os horários de um Tecnico Veterinário específico.
     * @return
     */
    public ArrayList consultarHorariosTecVet(TecnicoVeterinario tec){
        return new ArrayList();
    }

    /**
     * Retorna um ArrayList contendo os horários do Hotelzinho.
     * @return
     */
    public ArrayList consultarHorariosHotel(){
        return new ArrayList();
    }
}
