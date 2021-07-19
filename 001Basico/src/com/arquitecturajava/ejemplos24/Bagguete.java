package com.arquitecturajava.ejemplos24;

public class Bagguete extends Pan{

	@Override
	public void cocer() {
		System.out.println("la baggete se cuece en 10 minutos");
	}

	public Bagguete(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}
	
}
