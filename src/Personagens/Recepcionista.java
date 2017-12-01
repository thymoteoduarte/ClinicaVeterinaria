package Personagens;

import Repositorios.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Recepcionista extends Funcionario{

                                                                                                            //Construtor de Recepcionista

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
        repositorio.add(this);
    }


                                                                                                            //Metodos de Recepcionista:

    /**
     * Recebe um objeto do tipo Animal, e o coloca no repositório de Animais
     */
    public void cadastrarAnimal(Animal animal, Repositorios repositorio){
        repositorio.add(animal);
    }

    /**
     * Reserva o horário de um veterinario para a consulta ou cirurgia de um animal.
     * @param veterinario
     * @param paciente
     */
    public boolean marcarConsulta(Veterinario veterinario, Animal paciente, LocalDate data){
        if (veterinario.existeVaga(data)){
            Consulta c = new Consulta(veterinario, paciente, data);
            veterinario.preencherVaga(c);
            return true;
        }

        return false;
    }

    /**
     * Deixa livre um horário do Veterinário.
     * @param funcionario
     * @param animal
     */
    public boolean desmarcarConsulta(Veterinario funcionario, Animal animal, LocalDate data){
        Consulta consulta = new Consulta(funcionario, animal, data);

        if (funcionario.getConsultasMarcadas().contains(consulta)){
            funcionario.desmarcar(consulta);
            return true;
        }
        return false;
    }

    /**
     * Reserva uma vaga para o hotelzinho.
     */
    public boolean reservarVaga(Animal animal, LocalDate data, Hotelzinho hotelzinho){
        return hotelzinho.reservar(animal, data);
    }

    /**
     * Deixa livre uma vaga do hotelzinho.
     */
    public boolean cancelarVaga(Animal animal, LocalDate data, Hotelzinho hotelzinho){
        Vaga vaga = new Vaga(data);
        vaga.preencherVaga(animal);
        return hotelzinho.desoculparVaga(vaga);
    }

    /**
     * Marca um horário para a vacina de um animal.
     */
    public void masrcarVacina(Animal animal, LocalDate data){
        //Implementar.
    }


    /**
     * Cancela a marcação de uma vacinação de um animal
     */
    public void desmarcarVacina(Animal animal, LocalDate data){
        //Implementar.
    }

}
