package negocio.entidades;

import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaEncerradaException;

import java.time.LocalDate;

public class Consulta {
	Veterinario veterinario;
	LocalDate data;
	String historico;
	boolean encerrado;

	public Consulta(Veterinario veterinario, LocalDate data) {
		this.veterinario = veterinario;
		this.data = data;
		this.encerrado = false;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public LocalDate getData() {
		return data;
	}

	//retorna as observações sobre o paciente adicionadas durante a consulta
	public String getHistorico() {
		return historico;
	}


	public void setHistorico(String historico){
		this.historico = historico;
	}

	public void encerrar(){
		this.encerrado = true;
	}

	public boolean getEncerrado() {
		return this.encerrado;
	}
}