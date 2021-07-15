package ejemplos15Herencia;

public class Documento {
	private String titulo;
	private int numPaginas;
	private String autor;
	
	public Documento(String titulo, int numPaginas, String autor) {
		super();
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void imprimir() {
		System.out.println("El documento se imprime");
	}
	
	
	
}
