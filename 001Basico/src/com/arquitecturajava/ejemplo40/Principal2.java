package com.arquitecturajava.ejemplo40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();		
		
		lista.add(new Persona("Ruben", "Gomez", 30));
		lista.add(new Persona("David", "Perez", 45));
		lista.add(new Persona("Noelia", "Pozo", 41));
		
		Collections.sort(lista);
		
		lista.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}	
		});
		
		
		System.out.println("---------------Ordenados por nombre----------------------");
		for(Persona p: lista) {
			System.out.println(p);
		}
		
	}
	
	

}
