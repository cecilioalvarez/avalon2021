package com.arquitecturajava.ejemplos8;

public class Lampara {
	private String marca;
	private int lumenex;
	
	public int getLumenex() {
		return lumenex;
	}

	public void setLumenex(int lumenex) {
		this.lumenex = lumenex;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Lampara(String marca) {
		super();
		this.marca = marca;
		this.lumenex = 10;
	}
	
	public Lampara(int lumenex) {
		super();
		this.marca = "m3";
		this.lumenex = lumenex;
	}
	
	public Lampara(String marca, int lumenex) {
		super();
		this.marca = marca;
		this.lumenex = lumenex;
	}
	
	public void encender() {
		System.out.println("La lámpara se ilummina con 5 lúmenex");
	}
	
	public void encender(int lumenex) {
		System.out.println("La lámpara se ilummina con " + lumenex + " lúmenex");
	}
}
