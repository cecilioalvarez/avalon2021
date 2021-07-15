package herencia02;

public class Comic extends Libro {
	private String nombreIlustrador;

	public String getNombreIlustrador() {
		return nombreIlustrador;
	}

	public void setNombreIlustrador(String nombreIlustrador) {
		this.nombreIlustrador = nombreIlustrador;
	}

	public Comic(String autor, String titulo, int numPag, int peso, String nombreIlustrador) {
		super(autor, titulo, numPag, peso);
		this.nombreIlustrador = nombreIlustrador;
	}




}
