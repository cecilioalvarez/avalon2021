package ejemplos02;

public class Persona {
	
	String nombre;
	int edad;
	
	public void isJubilado() {
		
		boolean jubilado = true;
		
		if (edad > 65) {
			System.out.println("Est� jubilado");
		}else {
			System.out.println("No est� jubilado");
		}
		
		
		
	}

}
