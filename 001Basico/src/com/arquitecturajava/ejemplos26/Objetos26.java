package com.arquitecturajava.ejemplos26;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Objetos26 {
	public static void main(String[] args) {

		Map<String, Persona> mapa = new HashMap<String, Persona>();
		mapa.put("pepe", new Persona("pepe", "perez", 25));
		mapa.put("ana", new Persona("ana", "gomez", 30));
		mapa.put("maria", new Persona("maria", "blanca", 50));
		mapa.put("gema", new Persona("gema", "perez", 30));

		System.out.println(mapa.get("pepe").getApellidos());
		System.out.println(mapa.get("pepe").getEdad());

		int edadMaxima = 0;
		double total = 0;

		for (Map.Entry<String, Persona> entrada : mapa.entrySet()) {

			Persona p = entrada.getValue();
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
			System.out.println(p.getEdad());
			if (edadMaxima < p.getEdad())
				edadMaxima = p.getEdad();
			total += p.getEdad();
		}
		System.out.println(edadMaxima);
		System.out.println(total / mapa.size());

	}
}
