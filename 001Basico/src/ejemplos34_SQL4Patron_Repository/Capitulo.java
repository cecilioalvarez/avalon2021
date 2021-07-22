package ejemplos34_SQL4Patron_Repository;

public class Capitulo {

	private String titulo;
	private int paginas;
	private String libro_isbn;
	
	public Capitulo(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Capitulo(String titulo, int paginas, String libro_isbn) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
		this.libro_isbn = libro_isbn;
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
	public String getLibro_isbn() {
		return libro_isbn;
	}
	public void setLibro_isbn(String libro_isbn) {
		this.libro_isbn = libro_isbn;
	}

	@Override
	public String toString() {
		return "El capitulo de titulo = " + titulo + ", tiene " + paginas + " paginas, siendo del libro con isbn=" + libro_isbn;
	}
	
	
}
