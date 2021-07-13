package ejemplos02;

public class Persona {

	String nombre;
	int edad;

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
