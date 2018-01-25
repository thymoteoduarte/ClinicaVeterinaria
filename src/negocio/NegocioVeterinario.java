package negocio;

import java.time.LocalDate;

import dados.funcionarios.RepositorioVeterinarios;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaEncerradaException;
import negocio.excecoes.ConsultaNaoMarcadaException;
import negocio.excecoes.LoginInvalidoException;
import negocio.excecoes.VeterinarioNaoCadastradoExceptions;

public class NegocioVeterinario {
	private RepositorioVeterinarios lista;
	
	public NegocioVeterinario( RepositorioVeterinarios lista) {
		 this.lista = lista;
	}


	//retorna um veterinario atravez do seu nome
	public Veterinario getVeterinario(String nome) throws VeterinarioNaoCadastradoExceptions {
		for(Veterinario vet : this.lista.getVeterinarios()){
			if(vet.getNome().equals(nome)){
				return vet;
			}
		}
		throw new VeterinarioNaoCadastradoExceptions();
	}



	
	//Encerra uma consulta marcada para a data atual, e adiciona as observações do veterinario no protuario do animal
	public void encerrar (Veterinario vet, Animal animal, String obs )  throws ConsultaNaoMarcadaException, ConsultaJaEncerradaException{
		Consulta consulta = new Consulta(vet, animal, LocalDate.now());
		
		if(vet.getConsultasMarcadas().contains(consulta)) {												//verifica se a consulta esta marcada
			if(!consulta.getEncerrado()) {																//verifica se ela ja está encarrada
				consulta.setHistorico(obs);
				consulta.encerrar();
				animal.setConsulta(consulta);
				vet.getConsultasMarcadas().set(vet.getConsultasMarcadas().indexOf(consulta), consulta);
			}else {
				throw new ConsultaJaEncerradaException();
			}
			
		}else {
			throw new ConsultaNaoMarcadaException();
		}
	}

	//faz o login do veterinario no sistema
	public Veterinario login(String login, String senha) throws LoginInvalidoException{
		for(Veterinario veterinario : lista.getVeterinarios()) {
	    	if(veterinario.getLogin().equals(login) && veterinario.getSenha().equals(senha)) {
	    		return veterinario;
	    	}
	    }
	    throw new LoginInvalidoException();
	}
}
