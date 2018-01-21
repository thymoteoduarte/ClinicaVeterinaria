package negocio.entidades.pessoas;

import negocio.entidades.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<Animal> listaAnimais;


                                                                                                                //Construtor de Cliente:
    public Cliente(String nome, String sexo, String fone, LocalDate data, Endereco end){
        super(nome, sexo, fone, data, end);
        this.listaAnimais = new ArrayList<>();
    }




                                                                                                                //Metodos de Cliente:

    /**
     * @param animal
     * Remove um, animal da ListaDeAnimais do Cliente.
     */
    public void removeAnimal(Animal animal) {
        this.listaAnimais.remove(animal);
    }


                                                                                                           //getters e setters:

    /**
     * @return Retorna a lista de animais de um Cliente
     */
    public ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    /**
     * @param novo
     * Adiciona um animal na ListaDeAnimais de um Cliente
     */
    public void setAnimal(Animal novo){
        if(!this.listaAnimais.contains(novo))
            this.listaAnimais.add(novo);
    }


    /**
     * @param nome
     * @return Retorna um animal, se existir um animal na ListaDeAnimais do Cliente com o nome igual ao passado como parametro, caso contrário, retorna null.
     */
    public Animal getAnimal(String nome) {
        for (Animal n : this.listaAnimais) {
            if (n.getNome().equals(nome))
                return n;
        }
        return null;
    }


    //Sobreposição de merodos
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Cliente)
        {
            Cliente teste = (Cliente) obj;
            if (this.getNome().equals(teste.getNome()) && this.getDataNascimento().equals(teste.getDataNascimento()) && this.getSexo().equals(teste.getSexo())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "Sexo: " + this.getSexo() +
                "Fone: " + this.getTelefone() +
                "Data de nascimento: " + this.getDataNascimento().toString() +
                "Endereço: " + this.getEndereco().toString();
    }
}
