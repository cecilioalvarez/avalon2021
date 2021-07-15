package herencia02;

public class Documento {
	
	private String autor;
	private String titulo;
	private int numPag;
	
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
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
	public Documento(String autor, String titulo, int numPag) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.numPag = numPag;
	}

	

}
