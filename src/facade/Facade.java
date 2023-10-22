package facade;

import subsistema1.LibService;
import subsistema2.LibApi;

public class Facade {

	public void addLivro(String titulo, String autor) {
		String editora = LibApi.getLib().recuperarEditora(titulo);
		int ano = LibApi.getLib().recuperarAno(titulo);

		LibService.gravarLivro(titulo, autor, ano, editora);
	}

}
