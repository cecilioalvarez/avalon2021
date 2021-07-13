package com.arquitecturajava.ejemplos3;

public class Objetos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p= new Persona();
		p.setNombre("Pedro");
		p.setEdad(70);
		System.out.println(p.retirado());
		System.out.println(p.mayordeedad());
		
		Persona p1= new Persona();
		p1.setNombre("Ana");
		p1.setEdad(10);
		System.out.println(p1.mayordeedad());
		System.out.println(p1.mayordeedad());
		
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());

		
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		
		Persona p2= new Persona();
		System.out.println(p2.getNombre());
		System.out.println(p2.getEdad());
		
	}

}
