package clinica;

import fachada.FachadaRecepcionista;
import negocio.NegocioRecepcionista;
import negocio.entidades.Animal;
import negocio.entidades.Consulta;
import negocio.entidades.pessoas.Recepcionista;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.ConsultaJaMarcadaException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dados.funcionarios.RepositorioRecepcionistas;

public class Teste {
    public static void main(String[] args) {
		FachadaRecepcionista recepcionista = new FachadaRecepcionista();
    }
}
