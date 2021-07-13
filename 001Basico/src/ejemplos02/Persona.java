package ejemplos02;

public class Persona {
	String nombre;
	int edad;
	
	public boolean jubilado() {
		if (edad>65) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean esMayordeEdad() {
		if (edad<18) {
			return false;
		}else {
			return true;
		}
		
	}
}
