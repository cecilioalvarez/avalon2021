package com.arquitecturajava.ejemplo41;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> mensajes = new ArrayList<String>();
		mensajes.add("hola");
		mensajes.add("que");
		mensajes.add("tal");
		mensajes.add("adios");

//		for(String mensaje: mensajes) {
//			System.out.println(mensaje);
//		}
		
		
		//ESTO ES UN STREAM O FLUJO DE PROGRAMACION FUNCIONAL
		mensajes.stream()
		//Imprimimos todas las palabras de la lista de mensaje con item A por delante
		.peek((s)->System.out.println("itemA" + s))
		//Ponemos filtros
		//Que imprima un mensaje que sea superior a 4 letras
		.filter((s)->s.length()>4)
		//Como solo adios tiene mas de 4 letras imprimira itemB mas la palabra adios, las demas palabras NO PASAN EL FILTRO
		.peek((s)->System.out.println("itemB" + s))
		//Le decimos que lo pase a mayusculas. Solo aparecera la palabra adios porque las demas palabras NO PASAN LOS FILTROS ANTERIORES.
		.map((s)->s.toUpperCase())
		.forEach((s)->System.out.println(s));
	}

}
