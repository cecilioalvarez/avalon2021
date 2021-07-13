package ejemplos03POO;

public class Persona {
	private String nombre;
	private int edad;
	
	
	
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
