package dados.funcionarios;

import negocio.entidades.pessoas.Funcionario;
import negocio.entidades.pessoas.Recepcionista;
import negocio.excecoes.RepositorioIncompativelException;

import java.util.ArrayList;

public class RepositorioRecepcionistas implements IRepositorioFuncionarios{
    private ArrayList<Recepcionista> lista;


    @Override
    public void adicionar(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Recepcionista)
            this.lista.add((Recepcionista) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public void remover(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Recepcionista)
            this.lista.remove((Recepcionista) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public void atualizar(Funcionario funcionario) throws RepositorioIncompativelException {
        if(funcionario instanceof Recepcionista)
            this.lista.add(this.lista.indexOf((Recepcionista)funcionario),(Recepcionista) funcionario);
        else
            throw new RepositorioIncompativelException();
    }

    @Override
    public ArrayList getFuncionarios() throws RepositorioIncompativelException {
        return this.lista;
    }

    @Override
    public boolean existe(Funcionario funcionario) {
        if (funcionario instanceof Recepcionista)
            return true;
        return false;
    }
}
