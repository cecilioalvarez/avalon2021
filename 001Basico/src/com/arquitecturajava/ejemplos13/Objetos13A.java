package com.arquitecturajava.ejemplos13;

public class Objetos13A {
	
	public static void main(String[] args) {

		Persona p= new Persona("gema",30);
		p.addNota(new Nota("lengua",4));
		p.addNota(new Nota("mates",8));
		p.addNota(new Nota("ingles",4));
		p.addNota(new Nota("fisica",10));
		
		
		for (Nota n: p.getNotas()) {
			
			System.out.println(n);
		}
		System.out.println("**************");
		System.out.println(p.getNotaMejor());
		
	}
}
