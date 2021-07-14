package com.arquitecturajava.ejemplo7;

public class Lampara {
	private String marca;
	private int lumenex;
	public String getMarca() {
		return marca;
	}

	public int getLumenex() {
		return lumenex;
	}

	public void setLumenex(int lumenex) {
		this.lumenex = lumenex;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	// Constructores
	public Lampara(String marca, int lumenex) {
		super();
		this.marca=marca;
		this.lumenex=lumenex;
	}
	public Lampara(String marca) {
		super();
		this.marca=marca;
	}
	public Lampara(int lumenex) {
		super();
		this.lumenex=lumenex;
	}
	public Lampara() {
		super();
	}
	public void encender() {
		System.out.println("La lámpara ilumina con 5 lumenex");
	}
	public void encender(int potencia) {
		System.out.println("La lámpara ilumina con "+potencia+ " lumenex");
	}
	
}
