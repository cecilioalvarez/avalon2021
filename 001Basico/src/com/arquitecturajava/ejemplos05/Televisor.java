package com.arquitecturajava.ejemplos05;

public class Televisor {
	
	private String marca;
	private int precio;
	private boolean encendido;
	
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
