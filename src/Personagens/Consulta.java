package Personagens;

import java.time.LocalDate;

public class Consulta {
	Veterinario veterinario;
	Animal animal;
	LocalDate data;
	String historico;

	public Consulta(Veterinario veterinario, Animal animal, LocalDate data) {
		this.veterinario = veterinario;
		this.animal = animal;
		this.data = data;
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


	public void setHistorico(String historico) {
		this.historico = historico;
		animal.setHistorico(this);
	}
}
