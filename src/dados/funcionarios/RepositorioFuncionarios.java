package dados.funcionarios;

import negocio.entidades.pessoas.Funcionario;

import java.util.ArrayList;

public class RepositorioFuncionarios implements IRepositorioFuncionarios{
    ArrayList<Funcionario> lista;

    public RepositorioFuncionarios() {
        this.lista = new ArrayList();
    }

    @Override
    public void adicionar(Funcionario funcionario) {
        this.lista.add(funcionario);
    }

    @Override
    public void remover(Funcionario funcionario) {
        this.lista.remove(funcionario);
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        this.lista.set(this.lista.indexOf(funcionario), funcionario);
    }

    @Override
    public ArrayList<Funcionario> getFuncionarios() {
        return this.lista;
    }

    @Override
    public boolean existe(Funcionario funcionario) {
        if(lista.contains(funcionario)){
            return true;
        }
        return false;
    }

    @Override
    public void atualizarSenha(Funcionario funcionario, String senha) {
        funcionario.setSenha(senha);
    }
}
