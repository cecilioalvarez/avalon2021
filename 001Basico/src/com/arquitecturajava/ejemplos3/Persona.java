package com.arquitecturajava.ejemplos3;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona() {
		this.setNombre("maria");
		this.setEdad(45);
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
	
	boolean mayorEdad() {
		return edad>=18;
	}
//	boolean estaJubilado() {
//		boolean jubilado=false;
//		if(edad>=65) {
//			jubilado=true;
//		}	
//		return jubilado;
//		
//		return edad>=65;
//	}

}