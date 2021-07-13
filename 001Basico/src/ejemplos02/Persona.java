package ejemplos02;

public class Persona {
	String nombre;
	int edad;
	
	public String jubilado() {
		String jubilado;
		if (edad>65) {
			jubilado= "Jubilado";
		}else {
			jubilado= "No Jubilado";
		}
		return jubilado;
		
	}
}
