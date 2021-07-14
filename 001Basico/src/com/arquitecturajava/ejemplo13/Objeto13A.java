package com.arquitecturajava.ejemplo13;

public class Objeto13A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona("Gema",30);
		
		p.addNota(new Nota("lengua",4));
		p.addNota(new Nota("mates",7));
		p.addNota(new Nota("ingles",8));
		p.addNota(new Nota("fisica",8));
		p.addNota(new Nota("lengua",7));
		
		for( Nota n: p.getNotas()) {
			System.out.println(n);
		}
		System.out.println("**********");
		System.out.println(p.getNotaMejor());
		System.out.println("**********");
		System.out.println(p.getMejoresNotas());
		System.out.println("**********");
		System.out.println(p.getNotaMejorAsignatura("lengua"));
		

	}

}
