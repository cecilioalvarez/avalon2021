package ejemplos10POO;

public class Persona {

	private String nombre;
	private int edad;
	
	//Propiedad Telefono 
	private Telefono telefono;
	
	//Constructor
	public Persona(String nombre, int edad, Telefono telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
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

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	
}