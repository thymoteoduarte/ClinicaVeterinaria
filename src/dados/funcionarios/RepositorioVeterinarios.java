package dados.funcionarios;


import negocio.entidades.pessoas.Veterinario;
import java.util.ArrayList;

public class RepositorioVeterinarios implements IRepositorioVeterinarios{
    private ArrayList<Veterinario> lista;

    public RepositorioVeterinarios(){
        this.lista = new ArrayList();
    }
    

    @Override
    public void adicionar(Veterinario veterinario){
            this.lista.add(veterinario);
    }

    @Override
    public void remover(Veterinario veterinario){
            this.lista.remove(veterinario);
    }

    @Override
    public void atualizar(Veterinario veterinario){
            this.lista.add(this.lista.indexOf(veterinario),veterinario);
    }

    @Override
    public ArrayList<Veterinario> getVeterinarios(){
        return this.lista;
    }

    @Override
    public boolean existe(Veterinario funcionario) {
            return this.lista.contains(funcionario);
    }


}
