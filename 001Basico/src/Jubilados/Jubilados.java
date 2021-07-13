package Jubilados;

public class Jubilados {
	
	String nombre;
	int edad;
	
	boolean estaJubilado () {
		if (edad>65) {
			return true;
		}else {
			return false;
		}
	}

	boolean mayoriaedad () {
		if (edad>=18) {
			return true;
		}else {
			return false;
		}
	}
}
