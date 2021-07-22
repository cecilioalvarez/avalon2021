package ejemplos34_SQL4Patron_Repository;

public class Capitulo {

	private String titulo;
	private int paginas;
	private Libro libro;
	
	public Capitulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Capitulo(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "El capitulo de titulo = " + titulo + ", tiene " + paginas + " paginas";
	}
	
	
}
