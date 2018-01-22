package clinica;

import fachada.FachadaRecepcionista;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        FachadaRecepcionista recepcionista = new FachadaRecepcionista();

        recepcionista.cadastrarCliente("nome cliente", "Masculino", "123456", LocalDate.now(), null);
        recepcionista.cadastrarAnimal("nome cliente", LocalDate.now(), "nome do animal", "feminino", "especie", "raça", LocalDate.now());
        recepcionista.listarInformacoes();



    }
}
