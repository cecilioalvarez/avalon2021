package herencia02;

public class LibroDigital extends Documento{
	
	private String plataformaDescarga;

	public String getPlataformaDescarga() {
		return plataformaDescarga;
	}

	public void setPlataformaDescarga(String plataformaDescarga) {
		this.plataformaDescarga = plataformaDescarga;
	}

	public LibroDigital(String autor, String titulo, int numPag, String plataformaDescarga) {
		super(autor, titulo, numPag);
		this.plataformaDescarga = plataformaDescarga;
	}



	

}
