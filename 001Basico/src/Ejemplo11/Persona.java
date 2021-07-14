package Ejemplo11;

public class Persona {
	private String nombre;
	private int edad;
	private Mascota mascota;
	public String getNombre() {
		return nombre;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
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
}
