package com.arquitecturajava.ejemplo40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();		
		
		lista.add(new Persona("Ruben", "Gomez", 30));
		lista.add(new Persona("David", "Perez", 45));
		lista.add(new Persona("Noelia", "Pozo", 41));
		
		lista.sort((o1, o2)->{
			return o1.getNombre().compareTo(o2.getNombre());
		});
		
		
		System.out.println("---------------Ordenados por edad----------------------");
		for(Persona p: lista) {
			System.out.println(p);
		}
		
		lista.sort(new PersonaNombreComparator());
		System.out.println("---------------Ordenados por nombre----------------------");
		
		for(Persona p: lista) {
			System.out.println(p);
		}
		
		lista.sort(new PersonaApellidosComparator());
		System.out.println("---------------Ordenados por apellidos----------------------");
		
		for(Persona p: lista) {
			System.out.println(p);
		}
	}
	
	

}
