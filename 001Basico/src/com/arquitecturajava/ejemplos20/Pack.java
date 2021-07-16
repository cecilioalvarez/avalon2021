package com.arquitecturajava.ejemplos20;

import java.util.ArrayList;

public class Pack {
	
	private Donut donut1;
	private Donut donut2;
	
	public Pack(String sabor, double precio) {
		super();
		this.donut1 = new Donut(sabor,precio/2);
		this.donut2 = new Donut(sabor,precio/2);
	}
	
	public Donut getDonut1() {
		return donut1;
	}
	
	public String getSabor() {
		return donut1.getSabor();
	}
	
	//Para cambiar el sabor del pack
	public void setSabor(String sabor) {
		this.getDonut1().setSabor(sabor);
		this.getDonut2().setSabor(sabor);
	}
	
	public Donut getDonut2() {
		return donut2;
	}
	
	//Quitamos los metodos set y lo dejamos solo de lectura porque una vez creado el pack no vamos a modificar sabores ni precio
	
	public double getPrecio() {
		return this.getDonut1().getPrecio()+this.getDonut2().getPrecio();
	}
}
