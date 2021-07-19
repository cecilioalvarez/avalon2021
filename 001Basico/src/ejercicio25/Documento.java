package ejercicio25;

public class Documento {
	private int id;
	private String contenido;
	private int version;
	
	
	public Documento(int id, String contenido, int version) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.version = version;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	

}
