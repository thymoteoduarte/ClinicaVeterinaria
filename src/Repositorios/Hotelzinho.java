package Repositorios;

import Personagens.*;

import java.util.ArrayList;
import java.time.LocalDate;

public class Hotelzinho {
    private ArrayList <Vaga> vagas;
    private int total;

    /**
     * Cria um objeto do tipo Hotelzinho, e delimita o número total de vagas pelo parametro passado.
     * @param total
     */
    public Hotelzinho (int total) {
        vagas = new ArrayList();
        this.total = total;
    }

    /**
     * @param animal
     * @return true se existir alguma vaga desoculpada.
     */
    public boolean reservar(Animal animal, LocalDate data){
        if(temVaga(data)){
            Vaga nova = new Vaga(data);
            nova.preencherVaga(animal);
            this.vagas.add(nova);
            return true;
        }

        return false;
    }

    public boolean temVaga(LocalDate data){
        int usadas = 0;
        for(Vaga v : vagas){
            if(v.getData().equals(data))
                usadas++;
        }

        if(usadas < total)
            return true;

        return false;
    }


    public boolean desoculparVaga(Vaga vaga){
        if(this.vagas.contains(vaga)){
            this.vagas.get(this.vagas.indexOf(vaga)).cancelarVaga();
            return true;
        }

        return false;
    }
}
