package com.arquitecturajava.ejemplo40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal6 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Ruben", "Gomez", 30));
		lista.add(new Persona("David", "Perez", 45));
		lista.add(new Persona("Noelia", "Pozo", 41));

		List<Persona> nueva = filtrarPersonas(new FiltroPersonaNombre("Ruben"), lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}
		
		System.out.println("**********************************");

		nueva = filtrarPersonas(new FiltroPersonaApellidos("Pozo"), lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}

	}

	public static List<Persona> filtrarPersonas(FiltroPersona filtro, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (filtro.test(p)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}

}
