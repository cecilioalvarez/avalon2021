package com.arquitecturajava.ejemplos02;

public class Persona {

	String nombre;
	int edad;
	
	
	boolean estaJubilado () {
		// DRY y DAMP 
		
		if (edad>65) {
			return true;
		}else {
			return false;
		}
		
	}
	boolean esMayordeEdad () {
		// DRY y DAMP 
		
		if (edad>18) {
			return true;
		}else {
			return false;
		}
		
	}
}
