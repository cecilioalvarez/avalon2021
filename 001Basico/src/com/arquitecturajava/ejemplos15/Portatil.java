package com.arquitecturajava.ejemplos15;

public class Portatil extends Ordenador{
	private int bateria;
	
	public Portatil(String marca, double precio, int bateria) {
		super(marca, precio);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El portatil se enciende en 15 segundos");
	}
	
}
