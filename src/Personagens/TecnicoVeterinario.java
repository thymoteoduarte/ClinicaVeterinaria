package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;

public class TecnicoVeterinario extends Funcionario{
	//aplicação de vacinas, banho, tosa.

	public TecnicoVeterinario(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco, String login, String senha) {
		super(nome, sexo, telefone, dataNascimento, endereco, login, senha);
	}

	@Override
	public void cadastrar(Repositorios repositorio) {
		repositorio.add(this);
	}

	@Override
	public void exibirMenu(Funcionario funcionario) {
		//implementar com a interface grafica.
	}


}