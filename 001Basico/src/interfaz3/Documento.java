package interfaz3;

public class Documento {

	private int id;
	private int version;
	private String contenido;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Documento(int id, int version, String contenido) {
		super();
		this.id = id;
		this.version = version;
		this.contenido = contenido;
	}

	public Documento() {

	}

}
