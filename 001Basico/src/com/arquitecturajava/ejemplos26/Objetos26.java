package com.arquitecturajava.ejemplos26;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Objetos26 {

	public static void main(String[] args) {
		//Map<String,Persona> mapa = new HashMap<String,Persona>();
		Map<String,Persona> mapa = new TreeMap<String,Persona>();
		mapa.put("pepe", new Persona("pepe", "perez", 25));
		mapa.put("ana", new Persona("ana", "gomez", 30));
		mapa.put("maria", new Persona("maria", "blanca", 50));
		mapa.put("gema", new Persona("gema", "perez", 30));
		
		//System.out.println(mapa.get("pepe").getApellidos());
		//System.out.println(mapa.get("pepe").getEdad());
		int edadMaximaCecilio= 0;
		double totalCecilio = 0;
		for(Map.Entry<String, Persona> entrada: mapa.entrySet()) {
			Persona p = entrada.getValue();
			System.out.println(p.getNombre());
			//System.out.println(p.getApellidos());
			//System.out.println(p.getEdad());
			//manera cecilio
			//if(edadMaximaCecilio<p.getEdad()) edadMaximaCecilio=p.getEdad();
			//totalCecilio +=p.getEdad();
		}
		//System.out.println("La edad maxima de las personas del map es " + edadMaximaCecilio);
		//System.out.println("La edad media de las personas del map es " + totalCecilio/mapa.size());
		
		//Mi manera
		int edadMaxima = 0;
		for(Map.Entry<String, Persona> entrada: mapa.entrySet()) {
			Persona p = entrada.getValue();
			if(p.getEdad()>edadMaxima) {
				edadMaxima = p.getEdad();
			}
		}
		System.out.println("La edad maxima de las personas del map es " + edadMaxima);
		
		//Mi manera
		double sumaEdades = 0;
		for(Map.Entry<String, Persona> entrada: mapa.entrySet()) {
			Persona p = entrada.getValue();
			sumaEdades += p.getEdad();
		}
		double mediaEdad = sumaEdades / mapa.size();
		System.out.println("La edad media de las personas del map es " + mediaEdad);
		
		
	}

}
