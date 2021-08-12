package com.arquitecturajava.ejemplo40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal4 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Ruben", "Gomez", 30));
		lista.add(new Persona("David", "Perez", 45));
		lista.add(new Persona("Noelia", "Pozo", 41));

		List<Persona> nueva = filtrarPersonasPorNombre("Ruben", lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}
		
		System.out.println("**********************************");

		nueva = filtrarPersonasPorApellido("Pozo", lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}

	}

	public static List<Persona> filtrarPersonasPorNombre(String nombre, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (p.getNombre().equals(nombre)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}

	public static List<Persona> filtrarPersonasPorApellido(String apellidos, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (p.getApellidos().equals(apellidos)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}

}
