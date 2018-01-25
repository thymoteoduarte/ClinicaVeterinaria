package negocio.entidades.pessoas;

import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.excecoes.ConsultaNaoMarcadaException;
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
     * Reserva o horário de um veterinario para a consulta ou cirurgia de um animal.
     * @param veterinario
     * @param paciente
     */
    public void marcarConsulta(Veterinario veterinario, Animal paciente, LocalDate data){
            Consulta c = new Consulta(veterinario, paciente,  data);
            paciente.setConsulta(c);
            veterinario.preencherVaga(c);
    }

    /**
     * Deixa livre um horário do Veterinário.
     * @param funcionario
     * @param animal
     */
    public void desmarcarConsulta(Veterinario funcionario, Animal animal, LocalDate data) throws ConsultaNaoMarcadaException {
        Consulta consulta = new Consulta(funcionario, animal, data);
        animal.removerConsulta(consulta);
        funcionario.desmarcar(consulta);

    }
}
