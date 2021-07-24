package Ejemplo15b;

public class Comic extends Libro {
	
	private String dibujante;

	public Comic(String titulo, String autor, int paginas, int peso, String editorial) {
		super(titulo, autor, paginas, peso, editorial);
		// TODO Auto-generated constructor stub
	}

	public String getDibujante() {
		return dibujante;
	}

	public void setDibujante(String dibujante) {
		this.dibujante = dibujante;
	}

	
	

}
