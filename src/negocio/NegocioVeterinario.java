package negocio;

import java.time.LocalDate;

import dados.funcionarios.RepositorioVeterinarios;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaEncerradaException;
import negocio.excecoes.ConsultaNaoMarcadaException;
import negocio.excecoes.LoginInvalidoException;

public class NegocioVeterinario {
	private RepositorioVeterinarios lista;
	
	public NegocioVeterinario( RepositorioVeterinarios lista) {
		 this.lista = lista;
	}
	
	
	public void encerrar (Veterinario vet, Animal animal, String obs )  throws ConsultaNaoMarcadaException, ConsultaJaEncerradaException{
		Consulta consulta = new Consulta(vet, animal, LocalDate.now());
		
		if(vet.getConsultasMarcadas().contains(consulta)) {
			if(!consulta.getEncerrado()) {
				consulta.setHistorico(obs);
				consulta.encerrar();
				vet.getConsultasMarcadas().set(vet.getConsultasMarcadas().indexOf(consulta), consulta);	
			}else {
				throw new ConsultaJaEncerradaException();
			}
			
		}else {
			throw new ConsultaNaoMarcadaException();
		}
		
		
	}
	
	  public Veterinario login(String login, String senha) throws LoginInvalidoException{
	    	for(Veterinario veterinario : lista.getVeterinarios()) {
	    		if(veterinario.getLogin().equals(login) && veterinario.getSenha().equals(senha)) {
	    			return veterinario;
	    			
	    		}    		
	    	}
	    	
	    	throw new LoginInvalidoException();
	    }
}
