package negocio;

import java.time.LocalDate;

import dados.funcionarios.RepositorioVeterinarios;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
//import negocio.entidades.pessoas.Veterinario;
import negocio.entidades.pessoas.Veterinario;

public class NegocioVeterinario {
	private RepositorioVeterinarios lista;
	
	public NegocioVeterinario( RepositorioVeterinarios lista) {
		 this.lista = lista;
	}
	
	
	public void encerrar (Veterinario vet, Animal animal, String obs ) {
		Consulta consulta = new Consulta(vet, animal, LocalDate.now());
		if(vet.getConsultasMarcadas().contains(consulta) && !consulta.getEncerrado()) {
			consulta.setHistorico(obs);
			consulta.encerrar();
			vet.getConsultasMarcadas().set(vet.getConsultasMarcadas().indexOf(consulta), consulta);
		}
		
		
	}
	
	public void Veterinario() {
		
	}
}
