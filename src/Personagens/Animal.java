package Personagens;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    private String nome, sexo, Especie, raca;
    private Cliente cliente;
    private int idade;
    private ArrayList historico;        //O tipo de dado do arrayList não foi especificado, por que será guardado uma Date (data da consulta) e uma String (observações feitas pelo veterinario)

    //Construtor de Animal
    public Animal(String nome, String sexo, String tipo, String raca, Cliente cliente, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.Especie = tipo;
        this.raca = raca;
        this.cliente = cliente;
        this.idade = idade;
        this.historico = new ArrayList();
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipo(String tipo) {
        this.Especie = tipo;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) { this.idade = idade; }

    public void setHistorico(String historico){
        this.historico.add(LocalDate.now());
        this.historico.add(historico);
    }


    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecie() { return Especie; }

    public String getRaca() {
        return raca;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList getHistorico() {
        return historico;
    }
}
