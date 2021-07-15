package ejemplos15Herencia;

public class LibroDigital extends Documento {

	private String plataforma;
	
	public LibroDigital(String titulo, int numPaginas, String autor, String plataforma) {
		super(titulo, numPaginas, autor);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	

}
