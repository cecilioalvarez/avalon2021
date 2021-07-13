package ejemplos02;

public class Objeto3 {
	public static void main(String[] args) {
		Persona per = new Persona();
		Persona per2 = new Persona();
		
		per.nombre = "Carmen";
		per.edad = 7;
		
		per2.nombre = "Jaime";
		per2.edad = 7;
		if (per.isJubilado()) {
			System.out.println("Jubilado");
			
		}else {
			System.out.println("No jubilado");
		}
		
		if (per2.isMayorEdad()) {
			System.out.println("Mayor de edad");
			
		}else {
			System.out.println("Menor de edad");
		}
		
		
		//System.out.println(per.isJubilado());
	
		
	}

}
