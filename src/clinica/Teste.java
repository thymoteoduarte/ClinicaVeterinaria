package clinica;

import fachada.FachadaRecepcionista;
import negocio.entidades.pessoas.Endereco;
import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
		FachadaRecepcionista recepcionista = new FachadaRecepcionista();
		Endereco endereco = new Endereco("Rua", "israel", "5", "123123", "jose m", "garanhuns", "pernambuco");
		recepcionista.cadastrarCliente("Yuri", "Masculino", "123123123", LocalDate.of(1996, 12, 1), endereco);

//<<<<<<< HEAD
        recepcionista.cadastrarCliente("nome cliente", "Masculino", "123456", LocalDate.now(), null);
        recepcionista.cadastrarAnimal("nome cliente", LocalDate.now(), "nome do animal", "feminino", "especie", "raça", LocalDate.now());
        
  //      recepcionista.listarInformacoes();
    //	Veterinario vet = new Veterinario("ADA", "c", "w", LocalDate.now(), null, "a", "s");
    	//Animal animal =  new Animal("asa", "sa", "sas", "SAS",  LocalDate.now());
    	//Consulta cons = new Consulta(vet, animal, LocalDate.now());
    	//NegocioRecepcionista nrc = new NegocioRecepcionista(new RepositorioRecepcionistas());
    	
    	//try {
    		//nrc.marcarConsulta(animal, vet, LocalDate.now());
    		///System.out.println(vet.getNome());
        	//qqSystem.out.println(vet.getConsultasMarcadas().toString());
    	//}catch(Exception ex) {
    		//System.out.println("Erro!");
    	//}
    	
//=======
		recepcionista.cadastrarAnimal("Yuri", LocalDate.of(1996,12,1), "lucrecia", "feminino", "cachorro", "pudle", LocalDate.of(2017,9,15));
//>>>>>>> 83329b91b24f8cf63be55ebdacdeabcb24bb7fd7

        System.out.println("Lista de animais de Yuri");
        for (String s:
             recepcionista.consultarListaAnimais("Yuri" , LocalDate.of(1996,12,1))) {
            System.out.println(s);
        }


    }
}
