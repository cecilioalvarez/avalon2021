package com.arquitecturajava.ejemplos10;

public class Persona {

	private String nombre;
	private int edad;
	// una variable que no es ni una cadena
	// ni es un tipo básico
	//una relacion entre dos clases
	
	private Telefono telefono;
	
	
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
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
	public Persona(String nombre, int edad, Telefono telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	
}
