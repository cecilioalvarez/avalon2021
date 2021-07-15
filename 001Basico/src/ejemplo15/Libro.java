package ejemplo15;

public class Libro extends Documento {
	
	private String peso;
	private String editorial;
	

	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public Libro(String titulo, String autor, int paginas, String editorial, 
			int peso) {
		super(titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	
	
}
