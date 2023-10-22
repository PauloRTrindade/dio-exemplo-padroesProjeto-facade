package subsistema2;

public class LibApi {
	
	private static LibApi lib = new LibApi();
	
	private LibApi() {
		super();
	}

	public static LibApi getLib() {
		return lib;
	}

	public int recuperarAno(String titulo) {
		return 2021;
	} 
	
	public String recuperarEditora(String titulo) {
		return "Bookman";
	}

}
