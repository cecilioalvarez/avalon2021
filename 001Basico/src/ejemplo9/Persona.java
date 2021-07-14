package ejemplo9;

public class Persona {
	private String nombre;
	private int edad;
	
	//variable que no es una cadena 
	//ni es un tipo basico
	//
	private int Telefono
	
	
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
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
	public Persona(String nombre, int edad, int telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Telefono = telefono;
	}
	
	
}
