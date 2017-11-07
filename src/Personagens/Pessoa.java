package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome, sexo, telefone;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private int idade;

    //Construtor
    public Pessoa(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        if (dataNascimento.getMonthValue() < LocalDate.now().getMonthValue() || (LocalDate.now().getMonthValue() == dataNascimento.getMonthValue() && dataNascimento.getDayOfMonth() <= LocalDate.now().getDayOfMonth()))
            this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        else
            this.idade = LocalDate.now().getYear() - dataNascimento.getYear() - 1;

    }

                                                                                //Metodo abstratos:

    public abstract void cadastrar(Repositorios repositorio);

                                                                                //getters e setters:
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
