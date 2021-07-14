package com.arquitecturajava.ejemplos13;

public class Objetos13B {
	
	public static void main(String[] args) {

		Persona p= new Persona("gema",30);
		p.addNota(new Nota("lengua",4));
		p.addNota(new Nota("mates",8));
		p.addNota(new Nota("ingles",4));
		p.addNota(new Nota("fisica",10));
		p.addNota(new Nota("lengua",10));
		
		System.out.println(p.getNotaMejor("lengua"));
		
		/*
		for (Nota n: p.getNotasMejores()) {
			
			System.out.println(n);
		}
		System.out.println("**************");
		*/
		
	}
}
