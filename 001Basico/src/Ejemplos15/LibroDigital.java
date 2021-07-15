package Ejemplos15;

public class LibroDigital extends Documento {
	private String plataforma;

	public LibroDigital(String titulo, String autor, int paginas, String plataforma) {
		super(titulo, autor, paginas);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
