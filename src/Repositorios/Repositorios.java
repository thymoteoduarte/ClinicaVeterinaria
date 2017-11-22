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
    public void addAnimal(Animal animal){
         rAnimais.add(animal);
    }

    public void addCliente(Cliente cliente){
        rClientes.add(cliente);
    }

    public void addVeterinario(Veterinario veterinario){
        rVeterinarios.add(veterinario);
    }

    public void addTecnico(TecnicoVeterinario tec){
        rTecnicos.add(tec);
    }

    public void addRecepcionista(Recepcionista recepcionista){
        rRecepcionistas.add(recepcionista);
    }

                                                    //Metodos que removem personagens de seus repositórios:

    public void removeAnimal(Animal animal){
        rAnimais.remove(animal);
    }

    public void removeCliente(Cliente cliente){
        rClientes.remove(cliente);
    }

    public void removeVeterinario(Veterinario veterinario){
        rVeterinarios.remove(veterinario);
    }

    public void removeTecnico(TecnicoVeterinario tec){
        rTecnicos.remove(tec);
    }

    public void removeRecepcionista(Recepcionista recepcionista){
        rRecepcionistas.remove(recepcionista);
    }



                                                    //Metodos que verificam se um personagem está cadastrado:

    public boolean contemAnimal(Animal animal){
        return this.rAnimais.contains(animal);
    }

    public boolean contemCliente(Cliente cliente){
        return this.rClientes.contains(cliente);
    }

    public boolean contemVeterinario(Veterinario veterinario){
        return this.rVeterinarios.contains(veterinario);
    }

    public boolean contemTecnico(TecnicoVeterinario tec){
        return this.rTecnicos.contains(tec);
    }

    public boolean contemRecepcionista(Recepcionista recepcionista){
        return this.rRecepcionistas.contains(recepcionista);
    }
}
