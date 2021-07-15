package herencia02;

public class Libro extends Documento {

	private int peso;

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Libro(String autor, String titulo, int numPag, int peso) {
		super(autor, titulo, numPag);
		this.peso = peso;
	}


	

}
