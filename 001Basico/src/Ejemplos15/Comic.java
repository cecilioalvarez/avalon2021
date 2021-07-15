package Ejemplos15;

public class Comic extends Libro {
	private String dibujante;

	public String getDibujante() {
		return dibujante;
	}

	public void setDibujante(String dibujante) {
		this.dibujante = dibujante;
	}

	public Comic(String titulo, String autor, int paginas, int peso, String editorial, String dibujante) {
		super(titulo, autor, paginas, peso, editorial);
		this.dibujante = dibujante;
	}
}
