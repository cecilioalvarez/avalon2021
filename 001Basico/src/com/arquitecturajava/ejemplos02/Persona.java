package com.arquitecturajava.ejemplos02;

public class Persona {
	String nombre;
	int edad;
	
	boolean jubilacion() {
		if (edad>65) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean mayorDeEdad() {
		if (edad>=18) {
			return true;
		} else {
			return false;
		}
	}
}
