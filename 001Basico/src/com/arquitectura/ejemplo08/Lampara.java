package com.arquitectura.ejemplo08;

public class Lampara {
	private String marca;
	private int lumenex;
	
	public Lampara(String marca,int lumenex) {
		this.setMarca(marca);
		this.setLumenex(lumenex);
	}
	public Lampara(String marca) {
		this.setMarca(marca);
		this.setLumenex(10);
	}
	public Lampara() {
		this.setMarca("m3");
		this.setLumenex(8);
	}
	
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
	
	public void encender() {
		System.out.println("la lámpara ilumina con 5 lumenex");
	}
	
	public void encender(int lumenex) {
		System.out.println("la lámpara ilumina con "+lumenex+" lumenex");
	}
	
}
