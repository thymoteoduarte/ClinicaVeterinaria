package fachada;

import dados.clientes.RepositorioClientes;
import gui.janelasMensagens.JanelaMensagem;
import negocio.NegocioCliente;
import negocio.entidades.pessoas.Cliente;
import negocio.excecoes.AnimalNaoCadastradoException;
import negocio.excecoes.ClienteNaoCadastradoException;

import java.time.LocalDate;

public class fachadaRecepcionista {
    private NegocioCliente negocioCliente;

    public fachadaRecepcionista () {
        negocioCliente = new NegocioCliente(new RepositorioClientes());                         //esse repositorio pode ser carregado de um arquivo.
    }

    public void removerAnimal(String nomeCliente, LocalDate dn, String especie, String nome, String raca){
        try {
            Cliente cliente = negocioCliente.getCliente(nomeCliente, dn);
            negocioCliente.removerAnimal(cliente, especie, nome, raca);

        } catch (ClienteNaoCadastradoException e) {
            new JanelaMensagem(e).exibir();
        } catch (AnimalNaoCadastradoException e) {
            new JanelaMensagem(e).exibir();
        }
    }
}
