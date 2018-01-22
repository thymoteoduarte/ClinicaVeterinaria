package negocio;

import java.time.LocalDate;
import java.util.ArrayList;

import dados.funcionarios.RepositorioRecepcionistas;
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaMarcadaException;
import negocio.excecoes.ConsultaJaMarcadaException;
import negocio.excecoes.ConsultaNaoMarcadaException;
import negocio.excecoes.LoginInvalidoException;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Funcionario;


public class NegocioRecepcionista {
    private RepositorioRecepcionistas lista;

    public NegocioRecepcionista(RepositorioRecepcionistas lista){
        this.lista = lista;
    }
    
    public Recepcionista login(String login, String senha) throws LoginInvalidoException{
    	for(Recepcionista recepcionista : lista.getRecepcionistas()) {
    		if(recepcionista.getLogin().equals(login) && recepcionista.getSenha().equals(senha)) {
    			return recepcionista;
    			
    		}    		
    	}
    	
    	throw new LoginInvalidoException();
    }
    
    //Adiciona uma consulta na lista de consultas marcadas do veterinario
    public void marcarConsulta(Animal animal, Veterinario veterinario, LocalDate data) throws ConsultaJaMarcadaException{
    	Consulta consulta = new Consulta(veterinario, animal, data);
    	if(!veterinario.getConsultasMarcadas().contains(consulta)) {
        	veterinario.preencherVaga(consulta);	
    	}else {
    		throw new ConsultaJaMarcadaException();
    	}
    	
    	
    	
    }
    
    //Retira uma consulta da lista de consultas marcadas de um veterinario
    public void desmarcar(Consulta consulta, Veterinario veterinario) throws ConsultaNaoMarcadaException {  	
    	if(veterinario.getConsultasMarcadas().contains(consulta)) {
    		veterinario.desmarcar(consulta);
    	}else {
    		throw new ConsultaNaoMarcadaException();
    	}	
    }
    
    //retorna a lista de consultas marcadas para a data passada como parametro
    public ArrayList<Consulta> getConsultas(LocalDate data, Veterinario veterinario){
    	ArrayList<Consulta> listaDeConsultas = new ArrayList();
    	
    	for(Consulta c : veterinario.getConsultasMarcadas()) {
    		if(c.getData().equals(data)) {
    			listaDeConsultas.add(c);
    		}
    	}
    	
    	return listaDeConsultas;
    }
    
    
    
    
    
    
    
}
