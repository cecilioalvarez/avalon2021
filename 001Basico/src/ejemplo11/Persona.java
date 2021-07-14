package ejemplo11;

public class Persona {
	
	private String nombre;
	int edad;
	Mascota mascota;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mascota = mascota;
	}
	
	
}
