package com.arquitecturajava.ejemplos15;

public class Ordenador {
	
	private String marca;
	private double precio;
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
	public Ordenador(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	

}
