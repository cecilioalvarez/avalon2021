package ejercicio11;

public class Enfermedad {
	private String nombre;
	private enum Gravedad{MUYALTA, ALTA, MEDIA, BAJA, MUYBAJA}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Enfermedad(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	

}
