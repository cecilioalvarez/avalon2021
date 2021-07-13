package com.arquitecturajava.ejemplos04;

public class Ordenador {
	public String modelo;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//metodo de iva
	public double getIva() {
		return this.getPrecio()*1.21;
	}
	int numero;
	int precio;
}
