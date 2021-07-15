package ejemplo15;

public class Comic extends Libro {
	private String dibujante;

	public Comic(String titulo, String autor, int paginas,
			String editorial, int peso) {
		super(titulo, autor, paginas, editorial, peso);
		// TODO Auto-generated constructor stub
	}

	public String getDibujante() {
		return dibujante;
	}

	public void setDibujante(String dibujante) {
		this.dibujante = dibujante;
	}

	

	
	

}
