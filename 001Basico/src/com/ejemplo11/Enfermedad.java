package ejemplo11;

public class Enfermedad {
	
	private String nombre;
	private int Gravedad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGravedad() {
		return Gravedad;
	}
	public void setGravedad(int gravedad) {
		Gravedad = gravedad;
	}
	public Enfermedad(String nombre, int gravedad) {
		super();
		this.nombre = nombre;
		Gravedad = gravedad;
	}
	
	

}
