package com.arquitecturajava.ejemplos04;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona() {
		this.setNombre("Maria");
		this.setEdad(20);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

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
