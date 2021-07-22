package SQL3;

public class Capitulo {
	private String titulo;
	private int paginas;
	private String libros_isbn;

	public Capitulo(String titulo, int paginas, String libros_isbn) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;
		this.libros_isbn = libros_isbn;
	}
	public Capitulo(String libros_isbn) {
		super();
		this.libros_isbn = libros_isbn;
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

	public String getLibros_isbn() {
		return libros_isbn;
	}

	public void setLibros_isbn(String libros_isbn) {
		this.libros_isbn = libros_isbn;
	}

}
