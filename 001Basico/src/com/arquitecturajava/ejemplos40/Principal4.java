package com.arquitecturajava.ejemplos40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Principal4 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		List<Persona>  nueva= filtrarPersonasPorNombre("pedro", lista);
		
		for (Persona p:nueva) {
		
			System.out.println(p);
		}

	}

	
	public static List<Persona> filtrarPersonasPorNombre(String nombre,List<Persona> listaPersonas) {
		
		List<Persona> listaFinal= new ArrayList<Persona>();
		for(Persona p:listaPersonas) {
			
			if (p.getNombre().equals(nombre)) {
				
				listaFinal.add(p);
			}
		}
		return listaFinal;
		
	}
	
}
