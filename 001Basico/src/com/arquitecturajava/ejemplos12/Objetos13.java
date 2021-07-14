package com.arquitecturajava.ejemplos12;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos13 {
	public static void main(String[] args) {
		ArrayList<Persona> persona= new ArrayList<Persona>();
		
		persona.add(new Persona("pepe",14));
		persona.add(new Persona("manolo",24));
		persona.add(new Persona("jose",44));
		
		//Recorriendo el arrayList con bucle for each
		for(Persona p:persona) {
			System.out.println(p.getNombre());
		}
		
		System.out.println("-------------------");
		//Reccoriendo el arrayList con bucle for normal
		for(int i=0;i<persona.size();i++) {
			System.out.println(persona.get(i).getNombre());
		}
		
		System.out.println("-------------------");
		//Reccoriendo el arrayList con iterator
		Iterator<Persona> it =persona.iterator();
		while(it.hasNext()) {
			Persona p = it.next();
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
	}
}
