package Repositorios;


import Personagens.*;

import java.util.ArrayList;

public class Repositorios {
    private ArrayList <Animal> rAnimais;
    private ArrayList <Cliente> rClientes;
    private ArrayList <Veterinario> rVeterinarios;
    private ArrayList <TecnicoVeterinario> rTecnicos;
    private ArrayList <Recepcionista> rRecepcionistas;

                                                    //Construtor:


    public Repositorios() {
        this.rAnimais = new ArrayList();
        this.rClientes = new ArrayList();
        this.rVeterinarios = new ArrayList();
        this.rTecnicos = new ArrayList();
        this.rRecepcionistas = new ArrayList();
    }

                                                    //Metodos que adicionam personagens em seus repositórios:
    public void add(Animal animal){
         rAnimais.add(animal);
    }

    public void add(Cliente cliente){
        rClientes.add(cliente);
    }

    public void add(Veterinario veterinario){
        rVeterinarios.add(veterinario);
    }

    public void add(TecnicoVeterinario tec){
        rTecnicos.add(tec);
    }

    public void add(Recepcionista recepcionista){
        rRecepcionistas.add(recepcionista);
    }

                                                    //Metodos que removem personagens de seus repositórios:

    public void remove(Animal animal){
        rAnimais.remove(animal);
    }

    public void remove(Cliente cliente){
        rClientes.remove(cliente);
    }

    public void remove(Veterinario veterinario){
        rVeterinarios.remove(veterinario);
    }

    public void remove(TecnicoVeterinario tec){
        rTecnicos.remove(tec);
    }

    public void remove(Recepcionista recepcionista){
        rRecepcionistas.remove(recepcionista);
    }



                                                    //Metodos que verificam se um personagem está cadastrado:

    public boolean contem(Animal animal){
        return this.rAnimais.contains(animal);
    }

    public boolean contem(Cliente cliente){
        return this.rClientes.contains(cliente);
    }

    public boolean contem(Veterinario veterinario){
        return this.rVeterinarios.contains(veterinario);
    }

    public boolean contem(TecnicoVeterinario tec){
        return this.rTecnicos.contains(tec);
    }

    public boolean contem(Recepcionista recepcionista){
        return this.rRecepcionistas.contains(recepcionista);
    }


                                                    //Metodos que retornam o repositório de um tipo de personagem:



}
