package com.arquitecturajava.ejemplo40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Principal7 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Ruben", "Gomez", 30));
		lista.add(new Persona("David", "Perez", 45));
		lista.add(new Persona("Noelia", "Pozo", 41));

		//En vez de pasarle el filtro le pasamos una lambda. El resultado es el mismo
		List<Persona> nueva = filtrarPersonas((p)->p.getNombre().equals("Ruben"), lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}
		
		System.out.println("**********************************");

		nueva = filtrarPersonas((p)->p.getApellidos().equals("Pozo"), lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}

	}

	public static List<Persona> filtrarPersonas(Predicate<Persona> filtro, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (filtro.test(p)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}

}
