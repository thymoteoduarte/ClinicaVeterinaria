package Personagens;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
    private String login, senha;

    public Funcionario(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
        super(nome, sexo, telefone, dataNascimento, endereco);
        this.login = login;
        this.senha = senha;
    }

    public abstract void FazerLogin();
    public abstract void exibirMenu();
}
