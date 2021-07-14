package com.arquitecturajava.ejemplos11;

public class Objeto11 {

	public static void main(String[] args) {
		/*Mascota m1 = new Mascota("Futre");
		Persona p1 = new Persona("Ruben", 30, m1);*/
		//Mas optimo
		Persona p1 = new Persona("Ruben",30, new Mascota("Futre", new Enfermedad("Leucemia",10)));
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getMascota().getNombre());
		System.out.println(p1.getMascota().getEnfermedad().getNombre());
	}
}
