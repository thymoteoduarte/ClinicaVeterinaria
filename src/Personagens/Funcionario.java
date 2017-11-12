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

    /**
     * Se o login e a senha passados como parametros, forem iguais ao login e senha do Funcionario, então o metodo faz o login do funcionario no sistema exibindo o menu.
     * @param login
     * @param senha
     */
    public void FazerLogin(String login, String senha) {
    	if (this.getLogin().equals(login)) 
    		exibirMenu(this);
    	else
    		System.out.println("Login ou senha incorreta!");
    }
    
    //Metodo abstrato para exibir o menu do funcionario.
    public abstract void exibirMenu(Funcionario funcionario);
    
    
    
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
}
