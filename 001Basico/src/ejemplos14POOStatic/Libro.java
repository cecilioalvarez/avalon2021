package ejemplos14POOStatic;

public class Libro {
	
	private static int contador=0;
	private String titulo;
	private String autor;
	private int paginas;
	
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Libro.contador = contador;
	}
	
	
	
	
}
