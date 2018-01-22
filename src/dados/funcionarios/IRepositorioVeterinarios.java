


package dados.funcionarios;

import java.util.ArrayList;

import negocio.entidades.pessoas.Veterinario;

public interface IRepositorioVeterinarios {
	
		void adicionar(Veterinario veterinario);
	    void remover(Veterinario veterinario);
	    void atualizar(Veterinario veterinario);
	    ArrayList<Veterinario> getVeterinarios() ;
	    boolean existe(Veterinario veterinario);

}
