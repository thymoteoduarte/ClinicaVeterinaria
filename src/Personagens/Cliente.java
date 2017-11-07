package Personagens;
import Repositorios.Repositorios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<Animal> ListaAnimais;


                                                            //Construtor de Cliente
    public Cliente(String nome, int idade, String sexo, String fone, LocalDate data,  Endereco end){
        super(nome, sexo, fone, data, end);
        ListaAnimais = new ArrayList<>();
    }


                                                            //Implementação do metodo cadastrar.
    @Override
    public void cadastrar(Repositorios repositorio) {
        if(!repositorio.contem(this))
            repositorio.add(this);
    }


                                                            //Metodos de Cliente:

    /**
     * @param animal
     * Remove um, animal da ListaDeAnimais do Cliente.
     */
    public void removeAnimal(Animal animal){
        this.getListaAnimais().remove(animal);
    }

    /**
     * @param especie
     * @param raca
     * @param nome
     * @return Retorna true, se o cliente possuir um animal que tenha o nome, raça e especie iguais aos passados como parametro.
     */
    public boolean ehDono(String especie, String raca, String nome){
        boolean resultado = false;

        for (Animal a : this.ListaAnimais) {
            if (a.getNome().equals(nome) && a.getEspecie().equals(especie) && a.getRaca().equals(raca))
                resultado = true;
        }
        return resultado;
    }


                                                            //getters e setters:

    /**
     * @return Retorna a lista de animais de um Cliente
     */
    public ArrayList<Animal> getListaAnimais() {
        return ListaAnimais;
    }

    /**
     * @param novo
     * Adiciona um animal na ListaDeAnimais de um Cliente
     */
    public void setAnima(Animal novo){
        this.ListaAnimais.add(novo);
    }


    /**
     * @param nome
     * @return Retorna um animal, se existir um animal na ListaDeAnimais do Cliente com o nome igual ao passado como parametro, caso contrário, retorna null.
     */
    public Animal getAnimal(String nome) {
        for (Animal n : this.ListaAnimais) {
            if (n.getNome().equals(nome))
                return n;
        }
        return null;
    }
}
