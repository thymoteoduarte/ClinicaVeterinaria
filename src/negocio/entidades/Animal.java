package negocio.entidades;

import negocio.entidades.pessoas.Cliente;
import negocio.excecoes.ConsultaNaoMarcadaException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    private String nome, sexo, Especie, raca;
    private LocalDate dataNascimento;
    private ArrayList<Consulta> historico;
    private Cliente dono;

                                                                                                            //Construtor de Animal

    public Animal(String nome, String sexo, String especie, String raca, LocalDate dataNascimento, Cliente dono) {
        this.nome = nome;
        this.sexo = sexo;
        this.Especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.historico = new ArrayList();
        this.dono = dono;
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

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public Cliente getDono() {
        return dono;
    }

    public ArrayList<Consulta> getHistorico() {
        return this.historico;
    }


    //usado na hora de desmarcar uma consulta
    public void removerConsulta(Consulta consulta) throws ConsultaNaoMarcadaException {
        if(this.historico.contains(consulta))
            this.historico.remove(consulta);
        else
            throw new ConsultaNaoMarcadaException();
    }

                                                                                                            //Sobreposição de metodos
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Animal){
            Animal novo = (Animal) obj;
            if(this.nome.equals(novo.getNome()) && this.getSexo().equals(novo.getSexo()) && this.getEspecie().equals(novo.getEspecie()) && this.getRaca().equals(novo.getRaca())
                    && this.dataNascimento.equals(novo.getDataNascimento())){
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
                "\nData de nascimento: " + this.getDataNascimento().toString();

    }
}


