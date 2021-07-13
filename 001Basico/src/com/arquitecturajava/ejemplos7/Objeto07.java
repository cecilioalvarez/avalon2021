package com.arquitecturajava.ejemplos7;

public class Objeto07 {

	public static void main(String[] args) {
		Caja c = new Caja(20,30,40);
		System.out.println(c.calcularVolumen());
		Caja contenedor= c.getCajaVolumenHuecoMinimo();
		System.out.println(contenedor.getAncho());
		System.out.println(contenedor.getLargo());
		System.out.println(contenedor.getAlto());
		System.out.println(contenedor.calcularVolumen());
	}

}
