package Personagens;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
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


    //Metodo abstrato para exibir o menu do funcionario.
    public abstract void exibirMenu(Funcionario funcionario);

                                                                                                            //Metodos de Funcionario:

    /**
     * Se o login e a senha passados como parametros, forem iguais ao login e senha do Funcionario, ent�o o metodo faz o login do funcionario no sistema exibindo o menu.
     * @param login
     * @param senha
     */
    public void FazerLogin(String login, String senha) {
        if (this.getLogin().equals(this.login) && this.getSenha().equals(senha))
            exibirMenu(this);
        else
            System.out.println("Login ou senha incorreta!");
        //imlementar uma exeção.
    }


    /**
     * Atualiza a senha do funcionario, recebendo a senha atual e a nova.
     * @param senha
     * @param nova
     * @return
     */
    public boolean atualizarSenha(String senha, String nova){
        if(this.getSenha().equals(senha)){
            this.setSenha(nova);
        }
        return false;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() +
                "\nSexo: " + this.getSexo() +
                "\nTelefone: " + this.getTelefone() +
                "\nData de Nascimento:" + this.getDataNascimento().toString() +
                "\nEndereco" + this.getEndereco().toString();
    }

    //Getters e Setters:
    /**
     * @param login
     * Muda o login do Funcionario.
     */
    protected void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param senha
     * Muda a senha do Funcionario.
     */
    protected void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return Uma String que significa o login do Funcionario.
     */
    protected String getLogin() {
        return login;
    }

    /**
     * @return Uma String que significa a senha do Funcionario.
     */
    protected String getSenha() {
        return senha;
    }
}
