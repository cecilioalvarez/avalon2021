package ejemplos15Herencia;

public class Comic extends Libro {

	private String dibujante;
	
	public Comic(String titulo, int numPaginas, String autor, String editorial, int peso, String dibujante) {
		super(titulo, numPaginas, autor, editorial, peso);
		this.dibujante = dibujante;
	}

	public String getDibujante() {
		return dibujante;
	}

	public void setDibujante(String dibujante) {
		this.dibujante = dibujante;
	}
	
	
}
