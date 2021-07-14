package com.arquitecturajava.ejemplo11;



public class Objetos11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota mascota=new Mascota("Xima");
		Persona persona=new Persona("Francisco",40,mascota);
		System.out.println(persona.getNombre()+ " tiene una mascota que se llama "+ persona.getMascota().getNombre());
		
		
	}

}
