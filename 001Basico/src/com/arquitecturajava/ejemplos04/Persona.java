package com.arquitecturajava.ejemplos04;

public class Persona {

	// la palabra reservada private 
	// es un operador de ambito
	// define un ambito para la variable nombre y la variable edad
	private String nombre;
	private int edad;
	
	// un constructor
	public Persona() {
		
		this.setNombre("maria");
		this.setEdad(20);
	}
	
	// get lee el valor
	public String getNombre() {
		return nombre;
	}
	// el metodo set asigna el valor
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
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
