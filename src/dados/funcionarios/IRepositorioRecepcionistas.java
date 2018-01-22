package dados.funcionarios;

import java.util.ArrayList;

//import negocio.entidades.pessoas.Funcionario;
import negocio.entidades.pessoas.Recepcionista;
//import negocio.entidades.pessoas.Veterinario;

public interface IRepositorioRecepcionistas {
	void adicionar(Recepcionista recepcionista);
    void remover(Recepcionista recepcionista);
    void atualizar(Recepcionista recepcionista);
    ArrayList<Recepcionista> getRecepcionistas() ;
    boolean existe(Recepcionista recepcionista);
	//ArrayList<Recepcionista> getRecepcionistas();
}