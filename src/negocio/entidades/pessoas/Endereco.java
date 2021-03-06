package negocio.entidades.pessoas;

public class Endereco {
    private String tipo, nome, numero, cep, bairro;

    //Construtor de Endereco

    public Endereco(String tipo, String nome, String numero, String cep, String bairro, String cidade, String estado) {
        this.tipo = tipo;
        this.nome = nome;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
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

    //Metodos sbreescritos
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof negocio.entidades.pessoas.Endereco){
            negocio.entidades.pessoas.Endereco novo = (negocio.entidades.pessoas.Endereco) obj;
            if(this.getCep().equals(novo.getCep()) && this.getNumero().equals(novo.getNumero())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        if(!this.tipo.equals("") && !this.nome.equals("") && !this.numero.equals(""))
            return this.tipo + " " + this.nome + ", nº " + this.numero + ", " + this.bairro + ", CEP: " + this.cep;
        else
            return "Endereco não cadastrado";
    }
}
