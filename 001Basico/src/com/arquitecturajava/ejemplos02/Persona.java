package com.arquitecturajava.ejemplos02;

public class Persona {
	
	String nombre;
	int edad;
	
	boolean estaJubilado() {
//		boolean jubilado=false;
//		if(edad>=65) {
//			jubilado=true;
//		}	
//		return jubilado;
		
		return edad>=65;
	}
	boolean mayorEdad() {
		return edad>=18;
	}

}
