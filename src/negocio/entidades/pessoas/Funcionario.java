package negocio.entidades.pessoas;

import negocio.excecoes.FuncionarioNaoCadastradoException;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {
    private String login, senha;


    /**
     * Construtor de funcionario.
     * @param nome
     * @param sexo
     * @param telefone
     * @param dataNascimento
     * @param endereco
     * @param login
     * @param senha
     */
    public Funcionario(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
        super(nome, sexo, telefone, dataNascimento, endereco);
        this.login = login;
        this.senha = senha;
    }

    //Se o login e a senha passados como parametros, forem iguais ao login e senha do Funcionario,
    //entao o metodo faz o login do funcionario no sistema exibindo o menu.
    //O menu exibido deve estar de acordo com o cargo do funcionario.
    public abstract void FazerLogin(String login, String senha) throws FuncionarioNaoCadastradoException;       //retornar uma janela






                                                                                                             //Metodos de Funcionario:

    /**
     * Atualiza a senha do funcionario, recebendo a senha atual e a nova.
     * @param senha
     * @param nova
     * @return
     */
    public boolean atualizarSenha(String senha, String nova){                       //talvez fosse melhor colocar este metodo na classe de repositorio, pois isto é um metodo de atualização do objeto
        if(this.getSenha().equals(senha)){
            this.setSenha(nova);
        }
        return false;
    }





                                                                                                            //Getters e Setters:
    /**
     * @param login
     * Muda o login do Funcionario.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param senha
     * Muda a senha do Funcionario.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return Uma String que significa o login do Funcionario.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return Uma String que significa a senha do Funcionario.
     */
    public String getSenha() {
        return senha;
    }





                                                                                                                //Sobreescrita:
    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nSexo: " + this.getSexo() +
                "\nTelefone: " + this.getTelefone() +
                "\nData de Nascimento:" + this.getDataNascimento().toString() +
                "\nEndereco" + this.getEndereco().toString();
    }
}
