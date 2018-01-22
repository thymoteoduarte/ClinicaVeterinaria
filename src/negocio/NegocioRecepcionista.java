package negocio;

import java.time.LocalDate;

import dados.funcionarios.RepositorioRecepcionistas;
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
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
    
    public void marcarConsulta(Animal animal, Veterinario veterinario, LocalDate data){
    	
    	Consulta consulta = new Consulta(veterinario, animal, data);
    	veterinario.preencherVaga(consulta);
    	
    }
    
    public void desmarcar(Consulta consulta, Veterinario veterinario) {
    	
    	veterinario.desmarcar(consulta);
    }
}
