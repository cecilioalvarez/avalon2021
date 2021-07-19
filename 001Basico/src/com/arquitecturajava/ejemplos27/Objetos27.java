package com.arquitecturajava.ejemplos27;

import java.util.HashSet;
import java.util.Set;

public class Objetos27 {

	public static void main(String[] args) {
		Set <String> conjunto= new HashSet<String>();
		
		conjunto.add("hola");
		conjunto.add("hola2");
		conjunto.add("hola3");
		conjunto.add("hola");
		
		for (String cadena: conjunto) {
			//como no admite duplicados solo saldra hola 1 vez.
			System.out.println(cadena);
		}

	}

}
