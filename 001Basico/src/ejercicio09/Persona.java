package ejercicio09;

public class Persona {
	String nombre;
	int edad;
	Telefono mitel;
	
	

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
	

	public Telefono getMitel() {
		return mitel;
	}

	public void setMitel(Telefono mitel) {
		this.mitel = mitel;
	}

	public Persona(String nombre, int edad, Telefono mitel) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.mitel = mitel;
	}



}
