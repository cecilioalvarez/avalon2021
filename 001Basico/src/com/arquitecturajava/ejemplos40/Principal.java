package com.arquitecturajava.ejemplos40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));


		// anonimous class
		lista.sort((Persona o1, Persona o2)-> {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			});
		System.out.println("**************");
		for (Persona p : lista) {

			System.out.println(p);
		}
		
		

	}

}
