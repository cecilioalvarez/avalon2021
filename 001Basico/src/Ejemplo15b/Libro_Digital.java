package Ejemplo15b;

public class Libro_Digital extends Documento {
	
private String plataforma;
	
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Libro_Digital(String titulo, String autor, int paginas) {
		super(titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}

}
