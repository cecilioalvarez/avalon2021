package com.arquitecturajava.ejemplos02;

public class Objetos3 {

	public static void main(String[] args) {
		
		Persona p= new Persona();
		p.nombre="pedro";
		p.edad=70;
		
		System.out.println(p.estaJubilado());
		System.out.println(p.esMayordeEdad());
		
		Persona p1= new Persona();
		p1.nombre="ana";
		p1.edad=10;
		
		System.out.println(p1.estaJubilado());
		System.out.println(p1.esMayordeEdad());
	
	}
}
