package dados.funcionarios;

import negocio.entidades.pessoas.Funcionario;
import negocio.excecoes.RepositorioIncompativelException;

import java.util.ArrayList;

public interface IRepositorioFuncionarios {
    void adicionar(Funcionario funcionario) throws RepositorioIncompativelException;
    void remover(Funcionario funcionario) throws RepositorioIncompativelException;
    void atualizar(Funcionario funcionario) throws RepositorioIncompativelException;
    ArrayList getFuncionarios() throws RepositorioIncompativelException;
    boolean existe(Funcionario funcionario);
}
