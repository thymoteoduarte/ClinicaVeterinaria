package clinica;

import fachada.FachadaRecepcionista;
import negocio.NegocioRecepcionista;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaMarcadaException;

import java.time.LocalDate;

import dados.funcionarios.RepositorioRecepcionistas;

public class Teste {
    public static void main(String[] args) {
        /*FachadaRecepcionista recepcionista = new FachadaRecepcionista();

        recepcionista.cadastrarCliente("nome cliente", "Masculino", "123456", LocalDate.now(), null);
        recepcionista.cadastrarAnimal("nome cliente", LocalDate.now(), "nome do animal", "feminino", "especie", "raça", LocalDate.now());
        
        recepcionista.listarInformacoes();*/
    	Veterinario vet = new Veterinario("ADA", "c", "w", LocalDate.now(), null, "a", "s");
    	Animal animal =  new Animal("asa", "sa", "sas", "SAS",  LocalDate.now());
    	Consulta cons = new Consulta(vet, animal, LocalDate.now());
    	NegocioRecepcionista nrc = new NegocioRecepcionista(new RepositorioRecepcionistas());
    	
    	try {
    		nrc.marcarConsulta(animal, vet, LocalDate.now());
        	System.out.println(vet.getConsultasMarcadas().toString());
    	}catch(Exception ex) {
    		System.out.println("Erro!");
    	}
    	



    }
}
