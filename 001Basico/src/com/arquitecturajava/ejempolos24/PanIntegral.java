package com.arquitecturajava.ejempolos24;

public class PanIntegral extends Pan {

	public PanIntegral(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		System.out.println("el pan se cuece en 1 hora");
	}

}
