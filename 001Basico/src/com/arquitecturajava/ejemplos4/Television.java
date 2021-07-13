package com.arquitecturajava.ejemplos4;

public class Television {
	private String marca;
	private double precio;
	private boolean encendido;

	public String getMarca() {
		return marca;
	}

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

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public void on() {
		this.encendido = true;
	}

	public void off() {
		this.encendido = false;
	}
}
