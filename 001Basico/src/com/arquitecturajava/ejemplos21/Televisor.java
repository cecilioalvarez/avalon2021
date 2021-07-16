package com.arquitecturajava.ejemplos21;

public class Televisor implements Conectable {

	@Override
	public void encender() {
		System.out.println("el televisor se enciende");
		
	}

	@Override
	public void apagar() {
	
		System.out.println("el televisor se apaga");
	}

}
