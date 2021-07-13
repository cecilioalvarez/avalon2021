package com.arquitectura.ejemplo08;

public class Lampara {
	private String marca;

	public Lampara(String marca) {
		this.setMarca(marca);
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void encender() {
		System.out.println("la lámpara ilumina con 5 lumenex");
	}
	
	public void encender(int lumenex) {
		System.out.println("la lámpara ilumina con "+lumenex+" lumenex");
	}
	
}
