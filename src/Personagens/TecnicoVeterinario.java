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
	public void exibirMenu(Funcionario funcionario) {
		
	}
}
