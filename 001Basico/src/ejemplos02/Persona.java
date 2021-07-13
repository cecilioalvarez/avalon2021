package ejemplos02;

public class Persona {
	
	String nombre;
	int edad;
	
	public void isJubilado() {
		
		boolean jubilado = true;
		
		if (edad > 65) {
			System.out.println("Está jubilado");
		}else {
			System.out.println("No está jubilado");
		}
		
		
		
	}

}
