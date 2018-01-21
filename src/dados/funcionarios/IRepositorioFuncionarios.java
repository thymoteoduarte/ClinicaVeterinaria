package dados.funcionarios;

import negocio.entidades.pessoas.Funcionario;

import java.util.ArrayList;

public interface IRepositorioFuncionarios {
    void adicionar(Funcionario funcionario);
    void remover(Funcionario funcionario);
    void atualizar(Funcionario funcionario);
    ArrayList<Funcionario> getFuncionarios();
    boolean existe(Funcionario funcionario);
    void atualizarSenha(Funcionario funcionario, String senha);
}
