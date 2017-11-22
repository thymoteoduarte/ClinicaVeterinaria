package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Recepcionista extends Funcionario{
    public Recepcionista(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
		super(nome, sexo, telefone, dataNascimento, endereco, login, senha);
	}

	                                                                                                            //Metodos Herdados:
    
    @Override
	public void exibirMenu(Funcionario funcionario) {
        //implementação será feita com a interface gráfica.
    }

    @Override
    public void cadastrar(Repositorios repositorio) {
        repositorio.addRecepcionista(this);
    }
    
    
                                                    //Metodos de Funcionário:


    /**
     * Recebe os dados de um novo cliente, e o coloca no repositório de clientes
     */
    public void cadastrarCliente(Cliente cliente){
        cliente.cadastrar();
    }

    /**
     * Cadastra um animal de um cliente, e o coloca no repositório de Animais
     */
    public void cadastrarAnimal(){
    	//Implementar com a interface gr�fica.
    }

    /**
     * Reserva o horário de um veterinario para a consulta ou cirurgia de um animal.
     * @param veterinario
     * @param paciente
     */
    public void marcarConsulta(Veterinario veterinario, Animal paciente){
    	//Implementar com a interface gr�fica.
    }

    /**
     * Deixa livre um horário do Veterinário.
     * @param funcionario
     * @param animal
     */
    public void desmarcarConsulta(Veterinario funcionario, Animal animal){
    	//implementar com a interface gr�fica
    }

    /**
     * Reserva uma vaga para o hotelzinho.
     */
    public void reservarVaga(){
    	//Implementar com a interface gr�fica
    }

    /**
     * Deixa livre uma vaga do hotelzinho.
     */
    public void cancelarVaga(){
    	//Implementar com a interface gr�fica.
    }

    /**
     * Marca um horário para a vacina de um animal.
     */
    public void masrcarVacina(){
    	//Implementar com a interface gr�fica.
    }


    /**
     * Cancela a marcação de uma vacinação de um animal
     */
    public void desmarcarVacina(){
    	//Implementar com a interface gr�fica.
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
