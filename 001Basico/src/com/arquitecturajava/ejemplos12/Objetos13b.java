package com.arquitecturajava.ejemplos12;

public class Objetos13b {
	public static void main(String[] args) {
		Persona p = new Persona("Gema", 30);
		//Añadimos notas sin metodo addNotas
		//p.getNotas().add(new Nota("lengua", 4));
		//Añadimos notas con el metodo addNota
		p.addNota(new Nota("lengua",4));
		p.addNota(new Nota("mates",8));
		p.addNota(new Nota("ingles",4));
		p.addNota(new Nota("fisica",10));
		p.addNota(new Nota("lengua",10));
		
		System.out.println(p.getMejoresNotas("lengua"));
		
		
		System.out.println("-----------------------");
		
		for(Nota n: p.getMejoresNotas()) {
			System.out.println(n);
		}
		
		System.out.println("-----------------------");
		
		for(Nota n: p.getNotas()) {
			System.out.println(n);
		}
		System.out.println("-----------------------");
		System.out.println(p.getMejorNota());
	}
}
