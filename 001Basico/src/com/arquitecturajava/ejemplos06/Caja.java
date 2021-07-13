package com.arquitecturajava.ejemplos06;

public class Caja {

	private double largo;
	private double alto;
	private double ancho;
	
	
	public Caja(double largo, double alto, double ancho) {
		
		this.largo = largo;
		this.alto = alto;
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	public double calcularVolumen() {
		double volumen;
		volumen=this.getAlto()*this.getAncho()*this.getLargo();
		return volumen;
		
}
	
	
	
	
}
