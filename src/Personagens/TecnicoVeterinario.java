package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;

public class TecnicoVeterinario extends Funcionario{


    public TecnicoVeterinario(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
		super(nome, sexo, telefone, dataNascimento, endereco, login, senha);
	}

	@Override
    public void cadastrar(Repositorios repositorio) {

    }

    @Override
    public void FazerLogin() {

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
	public void exibirMenu() {
		
	}
}
