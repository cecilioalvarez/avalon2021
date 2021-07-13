package com.arquitecturajava.ejemplos02;

public class Objetos3 {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "pedro";
		p1.edad= 70;
		
		System.out.println(p1.jubilacion());
		System.out.println(p1.mayorDeEdad());
		
		Persona p2 = new Persona();
		p2.nombre="ruben";
		p2.edad = 10;
		
		System.out.println(p2.jubilacion());
		System.out.println(p2.mayorDeEdad());
	}
}
