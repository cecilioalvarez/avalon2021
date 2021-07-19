package com.arquitecturajava.ejempolos24;

public class Baggete extends Pan {

	public Baggete(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		
		System.out.println("la baggete se cuece en 10 m");
		
	}

	
}
