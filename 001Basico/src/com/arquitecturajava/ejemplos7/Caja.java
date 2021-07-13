package com.arquitecturajava.ejemplos7;

public class Caja {
	private double ancho;
	private double alto;
	private double largo;
	
	public Caja(double ancho, double alto, double largo) {
		this.ancho = ancho;
		this.alto = alto;
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
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double calcularVolumen() {
		return this.getAlto()*this.getAncho()*this.getLargo();
	}
	
	public Caja getCajaVolumenHuecoMinimo() {
		return new Caja(this.getAlto()*1.20, this.getAncho()*1.20,this.getLargo()*1.20);
	}
}
