package com.arquitecturajava.ejemplos04;

public class Objetos3 {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("pedro");
		p1.setEdad(70);
		
		System.out.println(p1.jubilacion());
		System.out.println(p1.mayorDeEdad());
		
		Persona p2 = new Persona();
		p2.setNombre("ruben");
		p2.setEdad(10);
		
		System.out.println(p2.jubilacion());
		System.out.println(p2.mayorDeEdad());
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		
		Persona p3 = new Persona();
		System.out.println(p3.getNombre());
		System.out.println(p3.getEdad());
	}
	
}
