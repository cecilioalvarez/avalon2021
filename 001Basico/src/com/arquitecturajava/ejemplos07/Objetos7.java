package com.arquitecturajava.ejemplos07;

public class Objetos7 {

	public static void main(String[] args) {

		Caja c1= new Caja(2,2,2);
		System.out.println(c1.getVolumen());
		Caja contenedor= c1.getCajaVolumenHuecoMinimo();
		System.out.println(contenedor.getLado1());
		System.out.println(contenedor.getLado2());
		System.out.println(contenedor.getLado3());
		System.out.println(contenedor.getVolumen());
		
	}

}
