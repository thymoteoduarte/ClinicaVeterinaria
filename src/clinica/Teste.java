package clinica;

import fachada.FachadaRecepcionista;
import negocio.entidades.pessoas.Endereco;
import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
		FachadaRecepcionista recepcionista = new FachadaRecepcionista();
		Endereco endereco = new Endereco("Rua", "israel", "5", "123123", "jose m", "garanhuns", "pernambuco");
		recepcionista.cadastrarCliente("Yuri", "Masculino", "123123123", LocalDate.of(1996, 12, 1), endereco);

		recepcionista.cadastrarAnimal("Yuri", LocalDate.of(1996,12,1), "lucrecia", "feminino", "cachorro", "pudle", LocalDate.of(2017,9,15));

        System.out.println("Lista de animais de Yuri");
        for (String s:
             recepcionista.consultarListaAnimais("Yuri" , LocalDate.of(1996,12,1))) {
            System.out.println(s);
        }


    }
}
