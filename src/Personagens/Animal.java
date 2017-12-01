package Personagens;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    private String nome, sexo, Especie, raca;
    private Cliente dono;
    private LocalDate dataNascimento;
    private ArrayList<Consulta> historico;

    //Construtor de Animal
    public Animal(String nome, String sexo, String especie, String raca, Cliente dono, LocalDate dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.Especie = especie;
        this.raca = raca;
        this.dono = dono;
        this.dataNascimento = dataNascimento;
        this.historico = new ArrayList();
    }

    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipo(String tipo) { this.Especie = tipo; }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setDataNscimento(LocalDate data) {
        this.dataNascimento = data;
    }

    public void setConsulta(Consulta consulta){ this.historico.add(consulta);}

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

    public Cliente getDono() {
        return this.dono;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public ArrayList getHistorico() {
        return historico;
    }


    //Sobreposição de metodos
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Animal){
            Animal novo = (Animal) obj;
            if(this.nome.equals(novo.getNome()) && this.getSexo().equals(novo.getSexo()) && this.getEspecie().equals(novo.getEspecie()) && this.getRaca().equals(novo.getRaca())
                    && this.getDono().equals(novo.getDono()) && this.dataNascimento.equals(novo.getDataNascimento())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nSexo: " + this.getSexo() +
                "\nEspecie: " + this.getEspecie() +
                "\nRaca: " + this.getRaca() +
                "\nDono: " + this.getDono() +
                "\nData de nascimento: " + this.getDataNascimento().toString();

    }
}


