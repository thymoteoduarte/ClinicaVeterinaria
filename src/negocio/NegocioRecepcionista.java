package negocio;

import java.time.LocalDate;
import java.util.ArrayList;

import dados.funcionarios.RepositorioRecepcionistas;
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaMarcadaException;
import negocio.excecoes.ConsultaNaoMarcadaException;
import negocio.excecoes.LoginInvalidoException;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.excecoes.RecepcionistaJaCadastradoException;

public class NegocioRecepcionista {
    private RepositorioRecepcionistas lista;

    public NegocioRecepcionista(RepositorioRecepcionistas lista){
        this.lista = lista;
        Recepcionista novo = new Recepcionista("recepcionista", "F", "11111111", LocalDate.now(), null, "456","456");
        this.lista.adicionar(novo);
    }



    public boolean login(String login, String senha) throws LoginInvalidoException{
    	for(Recepcionista recepcionista : this.lista.getRecepcionistas()) {
    		if(recepcionista.getLogin().equals(login) && recepcionista.getSenha().equals(senha)) {
    			return true;
    		}    		
    	}
    	throw new LoginInvalidoException();
    }
    
    //Adiciona uma consulta na lista de consultas marcadas do veterinario
    public void marcarConsulta(Animal animal, Veterinario veterinario, LocalDate data) throws ConsultaJaMarcadaException{
    	Consulta consulta = new Consulta(veterinario, animal, data);
    	if(!veterinario.getConsultasMarcadas().contains(consulta)) {
        	veterinario.preencherVaga(consulta);
        	//atualizar os repositorios
    	}else {
    		throw new ConsultaJaMarcadaException();
    	}
    }
    
    //Retira uma consulta da lista de consultas marcadas de um veterinario
    public void desmarcar(Consulta consulta, Veterinario veterinario) throws ConsultaNaoMarcadaException {  	
    	if(veterinario.getConsultasMarcadas().contains(consulta)) {
    		veterinario.desmarcar(consulta);
    		//atualizar os repositorios
    	}else {
    		throw new ConsultaNaoMarcadaException();
    	}	
    }

    public void addRecepcionista(Recepcionista novo) throws RecepcionistaJaCadastradoException {
    	if(!this.lista.existe(novo)){
    		this.lista.adicionar(novo);
		}else
			throw new RecepcionistaJaCadastradoException();
	}

    public RepositorioRecepcionistas getRecepcionistas() {
        return lista;
    }
}
