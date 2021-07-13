package com.arquitecturajava;

public class Televisor {

	private String marca;
	private double precio;
	private boolean encendido;
	
	public String getMarca() {
		return marca;
	}
	// el metodo set asigna el valor
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {		this.encendido=encendido;

	}
	
	public void on() {
		this.encendido=true;
	}
	public void off() {
		this.encendido=false;
	}

	

	}
