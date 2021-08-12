package com.arquitecturajava.ejemplos40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		Collections.sort(lista);

		for (Persona p : lista) {

			System.out.println(p);
		}

		lista.sort(new PersonaNombreComparator());
		System.out.println("**************");
		for (Persona p : lista) {

			System.out.println(p);
		}
		
		lista.sort(new PersonaApellidosComparator());
		System.out.println("**************");
		for (Persona p : lista) {

			System.out.println(p);
		}

	}

}
