package negocio;

import java.time.LocalDate;
import java.util.ArrayList;

import dados.funcionarios.RepositorioVeterinarios;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.*;

public class NegocioVeterinario {
	private RepositorioVeterinarios lista;

	//Construtor
	public NegocioVeterinario( RepositorioVeterinarios lista) {
		 this.lista = lista;
                 Veterinario novo = new Veterinario("veterinario 1", "123456", "M", LocalDate.now(), null, "123", "123");
                 this.lista.adicionar(novo);
                 
	}
        
        
        //faz o login do veterinario no sistema
	public Veterinario login(String login, String senha) throws LoginInvalidoException{
            for(Veterinario veterinario : this.lista.getVeterinarios()) {
	    	if(veterinario.getLogin().equals(login) && veterinario.getSenha().equals(senha)) {
	    		return veterinario;
	    	}
	    }
	    throw new LoginInvalidoException();
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
	public void encerrar (Veterinario vet, Consulta consulta, String obs )  throws ConsultaNaoMarcadaException, ConsultaJaEncerradaException{
		
		if(consulta.getData().equals(LocalDate.now()) && vet.getConsultasMarcadas().contains(consulta)) {												//verifica se a consulta esta marcada
			if(!consulta.getEncerrado()) {																//verifica se ela ja está encarrada

				vet.finalizarConsulta(consulta.getAnimal(), consulta, obs);
				vet.getConsultasMarcadas().set(vet.getConsultasMarcadas().indexOf(consulta), consulta);
			}else {
				throw new ConsultaJaEncerradaException();
			}
			
		}else {
			throw new ConsultaNaoMarcadaException();
		}
	}



        
        
	public void atualizar(Veterinario vet) throws VeterinarioNaoCadastradoExceptions {
		if(this.lista.getVeterinarios().contains(vet))
			this.lista.atualizar(vet);
		else
			throw new VeterinarioNaoCadastradoExceptions();
	}

        
        
	public void addVeterinario(Veterinario novo) throws VeterinarioJaCadastradoException {
		if(!this.lista.existe(novo))
			this.lista.adicionar(novo);
		else
			throw new VeterinarioJaCadastradoException();
	}
        
        
        public ArrayList<Veterinario> getListaVeterinarios(){
            return this.lista.getVeterinarios();
        }

}
