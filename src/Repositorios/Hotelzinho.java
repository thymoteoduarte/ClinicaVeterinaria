package Repositorios;

import Personagens.Animal;

import java.util.ArrayList;

public class Hotelzinho {
    ArrayList <Animal> vagas;
    int total;


    /**
     * Cria um objeto do tipo Hotelzinho, e delimita o número total de vagas pelo parametro passado.
     * @param total
     */
    public Hotelzinho (int total) {
        this.total = total;
        vagas = new ArrayList();
    }

    /**
     * @param animal
     * @return true se existir alguma vaga desoculpada.
     */
    public boolean preencherVaga(Animal animal){
        if(this.vagas.size() < this.total){
            this.vagas.add(animal);
            return true;
        }

        return false;
    }


    public boolean desoculparVaga(Animal animal){
        if(this.vagas.contains(animal)){
            this.vagas.remove(animal);
            return true;
        }
        System.out.println(animal.getNome() + " não está oculpando nenhuma vaga do hotelzinho!");
        return false;
    }
}
