package com.arquitecturajava.ejemplos15;

public class Objetos15 {

	public static void main(String[] args) {
		Portatil p = new Portatil("dell",700,100);
		System.out.println(p.getMarca());
		System.out.println(p.getPrecio());
		System.out.println(p.getBateria());
		p.encender();
		
		Ordenador o = new Ordenador("mac",2000);
		o.encender();
	}

}
