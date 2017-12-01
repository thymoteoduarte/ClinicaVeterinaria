package Personagens;

import java.time.LocalDate;

public class Vaga {
    private Animal animal;
    private boolean preenchida;
    private LocalDate data;

    //Construtor :
    public Vaga(LocalDate data){
        this.preenchida = false;
        this.data = data;
        this.animal = null;
    }

    /**
     * atribui um animal à vaga, e altera o valor da flag preenchida para true.
     * @param animal
     */
    public void preencherVaga(Animal animal){
        this.preenchida = true;
        this.animal = animal;
    }

    /**
     * altera o valor da flag preenchida para false, e o animal para null, fazendo com que a vaga fique liberada.
     */
    public void cancelarVaga(){
        this.preenchida = false;
        this.animal = null;
    }

    /**
     *
     * @return true se a vaga está oculpada.
     */
    public boolean oculpada(){
        return this.preenchida;
    }

    /**
     *
     * @return LocalDate referente a data que a vaga representa.
     */
    public LocalDate getData(){
        return this.data;
    }

}
