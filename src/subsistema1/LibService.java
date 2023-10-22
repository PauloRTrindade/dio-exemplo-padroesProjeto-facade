package subsistema1;

public class LibService {
	
	private LibService() {
		super();
	}
	
	public static void gravarLivro(String titulo, String autor, int anoPublicacao, String editora) {
		System.out.println("Livro salvo na biblioteca:");
		System.out.println();
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicacao: " + anoPublicacao);
		System.out.println("Editora: " + editora);
	}

}
