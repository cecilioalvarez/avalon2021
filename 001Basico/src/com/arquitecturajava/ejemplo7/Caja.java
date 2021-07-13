package com.arquitecturajava.ejemplo7;

public class Caja {
	private double largo;
	private double ancho;
	private double alto;
	public Caja(double largo, double ancho, double alto) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	
	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public double getAlto() {
		return alto;
	}


	public void setAlto(double alto) {
		this.alto = alto;
	}


	double calcularVolumen() {
		return getLargo()*getAncho()*getAlto();
	}
}
