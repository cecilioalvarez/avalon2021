package com.arquitecturajava.ejemplos12;

import java.util.ArrayList;

public class Objetos13a {

	public static void main(String[] args) {
		ArrayList<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota("mates",5));
		notas.add(new Nota("lengua",6));
		notas.add(new Nota("ingles",2));
		notas.add(new Nota("fisica",10));
		
		System.out.println("Lista de notas");
		for (Nota nota: notas) {
			System.out.println(nota.getValor());
		}
		
		System.out.println("------------------------------");
		//Sacamos la nota más alta
		Nota mayor = new Nota("lengua", 0);
		
		for (Nota nota: notas) {
			if(mayor.getValor()<nota.getValor()) {
				mayor = nota;
			}
		}
		System.out.println("La nota más alta es " + mayor.getValor());
		System.out.println("------------------------------");
		//Calculando nota media
		double sumaNotas= 0;
		for (Nota nota: notas) {
			//sumaNotas = sumaNotas + nota.getValor();
			sumaNotas += nota.getValor();
		}
		System.out.println("la nota media es " + sumaNotas/notas.size());
	}

}
