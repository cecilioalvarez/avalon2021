package com.arquitecturajava.ejemplo17;

public class Portatil extends Ordenador{
	
	private int bateria;

	public Portatil(String marca, int precio, int bateria) {
		super(marca, precio);
		this.setBateria(bateria);
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
		System.out.println("el portatil tarda 20 segundos en encender");
	}
	
	

	

}
