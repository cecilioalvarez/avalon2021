package ejemplos02;

public class Persona {
	String nombre;
	int edad;
	
	public boolean jubilado() {
		boolean jubilado;
		if (edad>65) {
			jubilado= true;
		}else {
			jubilado= false;
		}
		return jubilado;
		
	}
}
