package ejemplos02;

public class Persona {

	String nombre;
	int edad;
	
	

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
	


	public boolean isJubilado() {

		if (edad > 65) {
			return true;
		} else {
			return false;

		}

	}

	public boolean isMayorEdad() {

		if (edad > 18) {
			return true;
		} else {
			return false;

		}

	}

}
