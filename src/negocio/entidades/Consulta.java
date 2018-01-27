package negocio.entidades;

import negocio.entidades.pessoas.Veterinario;

import java.time.LocalDate;

public class Consulta {
	private Veterinario veterinario;
	private LocalDate data;
	private String historico;											//observacoes feitas pelo veterinario sobre a consulta (remedios passados, estado do paciente e etc.)
	private Animal animal;
	private boolean encerrado;

	public Consulta(Veterinario veterinario, Animal animal, LocalDate data) {
		this.veterinario = veterinario;
		this.data = data;
		this.encerrado = false;
		this.animal = animal;
	}

	public Veterinario getVeterinario() {
		return this.veterinario;
	}

	public LocalDate getData() {
		return this.data;
	}

	public Animal getAnimal(){ return this.animal;};

	public String getHistorico() {
		return this.historico;
	}

	public boolean getEncerrado() {
		return this.encerrado;
	}

	public void setHistorico(String historico){
		this.historico = historico;
	}

	public void encerrar(){
		this.encerrado = true;
	}


}