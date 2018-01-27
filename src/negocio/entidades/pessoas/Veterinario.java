package negocio.entidades.pessoas;

import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.excecoes.ConsultaJaEncerradaException;
import negocio.excecoes.ConsultaNaoMarcadaException;
import negocio.excecoes.FuncionarioNaoCadastradoException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Veterinario extends Funcionario {
    ArrayList <Consulta> consultasMarcadas;
    public static final int limite = 10;

    public Veterinario(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
        super(nome, sexo, telefone, dataNascimento, endereco, login, senha);
        consultasMarcadas = new ArrayList<Consulta>();
    }

    @Override
    public void FazerLogin(String login, String senha) throws FuncionarioNaoCadastradoException{
        if(this.getLogin().equals(login) && this.getSenha().equals(senha)){
            //JenelaVeterinario janela = new JanelaVeterinario(this);
            //
        }
    }

    /**
     * Preenche uma vaga de consulta, adicionando uma consulta ao repositorio de consultas do Veterinario.
     * @param consulta
     */
    public void preencherVaga(Consulta consulta){
        consultasMarcadas.add(consulta);
    }

    /**
     * Remove um consulta do repositorio de consultas marcadas.
     * @param consulta
     */
    public void desmarcar(Consulta consulta) throws ConsultaNaoMarcadaException {
        if(this.getConsultasMarcadas().contains(consulta))
            this.consultasMarcadas.remove(consulta);
        else
            throw new ConsultaNaoMarcadaException();
    }


    /**
     * Finaliza um consulta, adicionando ela ao repositorio de consultas do animal, e retirando do repositorio de consultas marcadas do veterinario.
     * @param consulta
     */
    public void finalizarConsulta(Animal animal, Consulta consulta ,String obs){
        consulta.setHistorico(obs);
        consulta.encerrar();
        animal.setConsulta(consulta);
        this.consultasMarcadas.remove(consulta);
    }

    /**
     * @return ArrayList de Consultas marcadas para o veterinário.
     */
    public ArrayList<Consulta> getConsultasMarcadas() {
        return consultasMarcadas;
    }
}
