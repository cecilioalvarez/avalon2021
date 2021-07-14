package com.arquitecturajava.ejemplos11;

public class Objeto11 {
	public static void main(String[] args) {

		
		
		Persona p = new Persona("ana", 20, new Mascota("mini"));

		System.out.println(p.getMascota().getNombre());
	}
}
