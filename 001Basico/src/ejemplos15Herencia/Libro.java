package ejemplos15Herencia;

public class Libro extends Documento {
	
	private String editorial;
	private int peso;
	
	public Libro(String titulo, int numPaginas, String autor, String editorial, int peso) {
		super(titulo, numPaginas, autor);
		this.editorial = editorial;
		this.peso = peso;
	}


	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public void imprimir() {
		System.out.println("El Libro se imprime por capítulos");
	}
	
	
	
	

}
