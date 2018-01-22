package dados.funcionarios;

import negocio.entidades.pessoas.Funcionario;
import negocio.entidades.pessoas.Veterinario;
import negocio.excecoes.RepositorioIncompativelException;

import java.util.ArrayList;

public class RepositorioVeterinarios implements IRepositorioFuncionarios{
    private ArrayList<Veterinario> lista;


    @Override
    public void adicionar(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Veterinario)
            this.lista.add((Veterinario) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public void remover(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Veterinario)
            this.lista.remove((Veterinario) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public void atualizar(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Veterinario)
            this.lista.add(this.lista.indexOf((Veterinario)funcionario),(Veterinario) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public ArrayList getFuncionarios() throws RepositorioIncompativelException {
        return this.lista;
    }

    @Override
    public boolean existe(Funcionario funcionario) {
        if (funcionario instanceof Veterinario)
            return true;
        return false;
    }
}
