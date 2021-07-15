package com.arquitecturajava.ejemplos13;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos13C {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("hola");
		lista.add("hola2");
		lista.add("hola3");
		lista.add("hola4");
		lista.add("hola5");
	
		//foreach
		//iterador que no les has de que borras
		for(String cadena: lista) {
			
			lista.remove(cadena);
		}
		

		Iterator<String> it = lista.iterator();

		while (it.hasNext()) {
			String cadena = it.next();
			System.out.println(cadena);
			if (cadena.equals("hola3")) {

				it.remove();
			}
		}
		System.out.println("********************");

		Iterator<String> it2 = lista.iterator();

		while (it2.hasNext()) {
			String cadena = it2.next();
			System.out.println(cadena);
			if (cadena.equals("hola3")) {

				it2.remove();
			}
		}

	}
}
