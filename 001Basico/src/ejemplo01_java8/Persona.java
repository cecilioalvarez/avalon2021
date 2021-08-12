package ejemplo01_java8;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellidos;
	private int edad;

	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona otra) {
		// TODO Auto-generated method stub
		if (this.getEdad() > otra.getEdad()) {
			return 1;

		} else if (this.getEdad() == otra.getEdad()) {
			return 0;
		} else {
			return -1;
		}

	}
}
