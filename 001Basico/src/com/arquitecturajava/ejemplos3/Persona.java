package com.arquitecturajava.ejemplos3;

public class Persona {
	int edad;
	String nombre;
	boolean jubilado;
	
	public Persona() {
		this.setNombre("maria");
		this.setEdad(20);
	}
	boolean mayordeedad() {
		if (edad>=18) {
			return true;
		} else {
			return false;
		}
	}
	boolean retirado() {
		if (edad>=65) {
			return true;
		} else {
			return false;
		}
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
