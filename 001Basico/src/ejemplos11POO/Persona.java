package ejemplos11POO;

public class Persona {

	private String nombre;
	private int edad;
	
	//Propiedad Mascota
	private Mascota mascota;
	
	//Constructor
	public Persona(String nombre, int edad, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mascota = mascota;
	}
	
	
	//Getter y Setters
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
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	
}
