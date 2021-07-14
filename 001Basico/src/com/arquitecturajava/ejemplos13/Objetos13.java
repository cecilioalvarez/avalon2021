package com.arquitecturajava.ejemplos13;

import java.util.ArrayList;

public class Objetos13 {

	public static void main(String[] args) {
		
		ArrayList<Nota> notas= new ArrayList<Nota>(); 
		notas.add(new Nota("mates",5));
		notas.add(new Nota("lengua",6));
		notas.add(new Nota("ingles",2));
		notas.add(new Nota("fisica",10));
		
		for (Nota nota : notas) {
			
			System.out.println(nota.getValor());
		}
		
	}
	
}
