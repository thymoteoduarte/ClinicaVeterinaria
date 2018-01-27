package negocio.entidades.pessoas;

import negocio.entidades.Animal;
import negocio.excecoes.AnimalNaoCadastradoException;

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

    /**
     *
     * @param animal
     * @return true se o Animal estiver vinculado ao Cliente
     */
    public boolean ehDono(Animal animal){
        if(this.listaAnimais.contains(animal))
            return true;
        return false;
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
        this.listaAnimais.add(novo);
    }

    //atualiza um animal
    public void atualizarAnimal(Animal animal){
        this.listaAnimais.set(this.listaAnimais.indexOf(animal), animal);
    }

    /**
     * @param nome
     * @return Retorna um animal, se existir um animal na ListaDeAnimais do Cliente com o nome igual ao passado como parametro, caso contrário, retorna null.
     */
    public Animal getAnimal(String nome) throws AnimalNaoCadastradoException{
        for (Animal n : this.listaAnimais) {
            if (n.getNome().equals(nome))
                return n;
        }
        throw new AnimalNaoCadastradoException();
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
