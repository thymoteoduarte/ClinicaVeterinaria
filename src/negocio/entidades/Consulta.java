package negocio.entidades;

import negocio.entidades.pessoas.Veterinario;

import java.time.LocalDate;

public class Consulta {
	Veterinario veterinario;
	Animal animal;
	LocalDate data;
	String historico;
	boolean encerrado;

	public Consulta(Veterinario veterinario, Animal animal, LocalDate data) {
		this.veterinario = veterinario;
		this.animal = animal;
		this.data = data;
		this.encerrado = false;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public Animal getAnimal() {
		return animal;
	}

	public LocalDate getData() {
		return data;
	}

	public String getHistorico() {
		return historico;
	}


	public boolean setHistorico(String historico) {
		if(!this.encerrado){
			this.historico = historico;
			return true;
		}
		return false;                       //o historico só pode ser atualizado em uma consulta em andamento
	}

	public void encerrar(){
		this.encerrado = true;
		this.animal.setConsulta(this);
	}
}