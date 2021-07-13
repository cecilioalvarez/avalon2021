package com.arquitecturajava.ejemplos04;

public class Objetos4 {

	public static void main(String[] args) {
		
		Televisor t = new Televisor();
		t.setMarca("Samsung");
		t.setPrecio(1000);
		t.setEncendido(true);
		
		System.out.println(t.isEncendido());
	}

}
