package ejemplo03;

	public class Persona {
		String nombre;
		int edad;
		
		boolean estaJubilado () {
			
			if(edad>65) {
				return true;
			}else {
				return false;
			}
		}
	}
