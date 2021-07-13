package com.arquitecturajava.ejemplos04;

public class factura {
 public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = 2;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public double getIva() {
		return this.getPrecio()*1.21;
		}
private double precio;
 private double numero;
}
