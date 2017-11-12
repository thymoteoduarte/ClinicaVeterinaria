package Personagens;

import Repositorios.Repositorios;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome, sexo, telefone;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private int idade;

    //Construtor
    public Pessoa(String nome, String sexo, String telefone, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        if (dataNascimento.getMonthValue() < LocalDate.now().getMonthValue() || (LocalDate.now().getMonthValue() == dataNascimento.getMonthValue() && dataNascimento.getDayOfMonth() <= LocalDate.now().getDayOfMonth()))
            this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
        else
            this.idade = LocalDate.now().getYear() - dataNascimento.getYear() - 1;

    }

                                                                                //Metodo abstratos:

    public abstract void cadastrar(Repositorios repositorio); 

                                                                                //getters e setters:
    /**
     * @return Uma String que significa o nome da Pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Um int que significa a idade da pessoa.
     */
    public int getIdade() {
    	if (this.dataNascimento.getMonthValue() < LocalDate.now().getMonthValue() || 
    			(LocalDate.now().getMonthValue() == this.dataNascimento.getMonthValue() && 
    			this.dataNascimento.getDayOfMonth() <= LocalDate.now().getDayOfMonth())) {
            this.idade = LocalDate.now().getYear() - this.dataNascimento.getYear();
    	} else {
            this.idade = LocalDate.now().getYear() - this.dataNascimento.getYear() - 1;
    	}
    	
        return this.idade;
    }

    /**
     * @return Uma String que significa o sexo da Pessoa.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @return Uma String que significa o telefone da Pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return Um LocalDate que significa a data de nascimento da pessoa;
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param nome
     * Atribui um novo nome a Pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param sexo
     * Atribui um novo sexo a Pessoa.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @param telefone
     * Atribui um novo Numero de Telefone a Pessoa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @param dataNascimento
     * Atribui uma nova dataNascimento a Pessoa.
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Compara duas Pessoas.
     * @return true se as pessoas tiverem os mesmos nomes, dataNascimento e Sexo. 
     */
    @Override
    public boolean equals(Object obj) {
		try {
			Pessoa r = (Pessoa) obj;
			return this.getNome().equals(r.getNome()) && this.getDataNascimento().equals(r.getDataNascimento()) && this.getSexo().equals(r.getSexo());
		} catch(Exception ex) {
			return false;
		}
    }
}
