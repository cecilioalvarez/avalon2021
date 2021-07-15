package com.aquitecturajava.ejemplo18;

public class LibroDigital extends Libro{
	
	public double tamano;

	
	public LibroDigital(String nombre, String titulo, String autor, double tamano) {
		super(nombre, titulo, autor);
		this.tamano = tamano;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	

}
