package ejercicio36;

public class Capitulo {
	private String nombre;
	private int paginas;
	private String libros_isbn;
	
	
	public Capitulo() {
		super();
	}
	public Capitulo(String nombre, int paginas, String libros_isbn) {
		super();
		this.nombre = nombre;
		this.paginas = paginas;
		this.libros_isbn = libros_isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
