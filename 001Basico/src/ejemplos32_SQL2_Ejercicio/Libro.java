package ejemplos32_SQL2_Ejercicio;

public class Libro {
	private String isbn;
	private String autor;
	private String titulo;
		
	public Libro(String isbn, String autor, String titulo) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
