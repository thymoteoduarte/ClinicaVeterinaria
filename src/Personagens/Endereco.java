package Personagens;

public class Endereco {
    String tipo, nome, numero, cep, bairro, cidade, estado;

    //Construtor de Endereco
    public Endereco(String tipo, String nome, String numero, String cep, String bairro, String cidade, String estado) {
        this.tipo = tipo;
        this.nome = nome;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    //getters e setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Endereco){
            Endereco novo = (Endereco) obj;
            if(this.getCep().equals(novo.getCep()) && this.getNumero().equals(novo.getNumero()))
                return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.tipo + " " + this.nome + ", nº " + this.numero + ", " + this.bairro + ", CEP: " + this.cep + ", " + this.cidade + " " + this.estado;
    }
}