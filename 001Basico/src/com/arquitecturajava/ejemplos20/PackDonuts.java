package com.arquitecturajava.ejemplos20;

public class PackDonuts {
	//no son dos objetos son dos variables
	private Donut donut1;
	private Donut donut2;
	
	
	public PackDonuts(String sabor, double precio) {
		super();
		this.donut1 = new Donut(sabor,precio/2);
		this.donut2 =new Donut(sabor,precio/2);
	
	}
	public Donut getDonut1() {
		return donut1;
	}
	
	public Donut getDonut2() {
		return donut2;
	}
	public double getPrecio() {
		return this.getDonut1().getPrecio()+this.getDonut2().getPrecio();
	}
	
	
	
}
