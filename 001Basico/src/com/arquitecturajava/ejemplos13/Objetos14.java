package com.arquitecturajava.ejemplos13;

public class Objetos14 {

	public static void main(String[] args) {
		Libro l = new Libro("java", "Pedro", 200);
		Libro l2 = new Libro("web", "Antonio", 500);
		Libro l3 = new Libro("javascript", "Ana", 100);
		System.out.println(l.getTitulo());
		System.out.println(l2.getTitulo());
		System.out.println(l3.getTitulo());
		System.out.println(Libro.getContador());
	}

}
