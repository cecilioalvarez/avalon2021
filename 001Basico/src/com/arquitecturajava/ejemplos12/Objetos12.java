package com.arquitecturajava.ejemplos12;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos12 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		lista.remove(0);
		lista.remove("estas");
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		
		System.out.println("Reccoriendo la lista con un iterador");
		Iterator it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("Bucle for each, a partir de Java 5");
		for(String cadena:lista) {
			System.out.println(cadena);
		}
	}

}
