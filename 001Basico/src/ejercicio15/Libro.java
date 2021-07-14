package ejercicio15;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	private static int contador = 0;

	public Libro(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		contador++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Libro.contador = contador;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

}
