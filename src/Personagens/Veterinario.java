package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;

public class Veterinario extends Funcionario {


    public Veterinario(String nome, int idade, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco) {
        super(nome, idade, sexo, telefone, dataNascimento, endereco, login, senha);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void cadastrar(Repositorios repositorio) {

    }

    @Override
    public void FazerLogin() {

    }
}
