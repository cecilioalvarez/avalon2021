package com.arquitecturajava.ejemplo17;

public class Ordenador {
	
	private String marca;
	private int precio;
	
	public Ordenador(String marca, int precio) {
		
		this.setMarca(marca);
		this.setPrecio(precio);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void encender() {
		System.out.println("el ordenaro enciende en 10 segundos");
	}
	
	

}
