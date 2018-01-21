package negocio.entidades.pessoas;

import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.excecoes.FuncionarioNaoCadastradoException;

import java.time.LocalDate;

public class Recepcionista extends Funcionario {

                                                                                                            //Construtor de Recepcionista

    public Recepcionista(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
        super(nome, sexo, telefone, dataNascimento, endereco, login, senha);
    }

    @Override
    public void FazerLogin(String login, String senha) throws FuncionarioNaoCadastradoException{
        if (this.getLogin().equals(login) && this.getSenha().equals(senha)) {
            //MenuRecepcionista menu = new MenuRecepcionista(this);
        }else{
            throw new FuncionarioNaoCadastradoException();
        }
    }


                                                                                                            //Metodos de Recepcionista:

    /**
     * Recebe um Animal e um Cliente, e o coloca no repositório de Animais
     */
    public void cadastrarAnimal(Animal animal, Cliente cliente){
        cliente.setAnimal(animal);
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
}
