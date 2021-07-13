package com.arquitecturajava.ejemplos05;

public class Televisor {
	
	private String marca;
	private double precio;
	private boolean encendido;
	
	public Televisor(String marca, double precio, boolean encendido) {
		this.marca = marca;
		this.precio = precio;
		this.encendido = encendido;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	/*
	boolean encedidoApagado() {
		if(encendido == true) {
			return true;
		}else {
			return false;
		}
	}*/
	
	public void on() {
		this.encendido = true;
	}
	
	public void off() {
		this.encendido = false;
	}
}
