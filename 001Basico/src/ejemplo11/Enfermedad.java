package ejemplo11;

public class Enfermedad {
	
	String nombre;
	int gravedad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGravedad() {
		return gravedad;
	}
	public void setGravedad(int gravedad) {
		this.gravedad = gravedad;
	}
	public Enfermedad(String nombre, int gravedad) {
		super();
		this.nombre = nombre;
		this.gravedad = gravedad;
	}
	
	
}
