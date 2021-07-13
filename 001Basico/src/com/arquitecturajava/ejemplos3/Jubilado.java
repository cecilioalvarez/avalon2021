package com.arquitecturajava.ejemplos3;

public class Jubilado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p =new Persona();
		p.edad=66;
		p.nombre="Juan";
		System.out.println("¿Jubilado? " + p.retirado());
		System.out.println("¿Mayor de edad? " + p.mayordeedad());
	}

}
