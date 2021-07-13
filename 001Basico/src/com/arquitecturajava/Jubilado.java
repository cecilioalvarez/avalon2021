package com.arquitecturajava;

public class Jubilado {
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
