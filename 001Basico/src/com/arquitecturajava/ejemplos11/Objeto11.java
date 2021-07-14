package com.arquitecturajava.ejemplos11;

public class Objeto11 {

	public static void main(String[] args) {
		Mascota m1 = new Mascota("Futre");
		Persona p1 = new Persona("Ruben", 30, m1);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getMascota().getNombre());
	}

}
