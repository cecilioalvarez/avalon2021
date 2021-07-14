package com.arquitecturajava.ejemplo14;

import java.util.ArrayList;

public class Objeto14 {
	public static void main(String[] args) {
		ArrayList<Nota> notas=new ArrayList<Nota>();
		
		notas.add(new Nota("mates",5));
		notas.add(new Nota("lengua",6));
		notas.add(new Nota("ingles",2));
		notas.add(new Nota("fisica",10));
		
		Nota mayor=new Nota("lengua",0);
		
		for(Nota nota:notas) {
			if(mayor.getValor()<nota.getValor()) {
				mayor=nota;
			}
		}
		System.out.println("La nota maxima es: " + mayor.getValor());
		double sumaNotas=0;
		for(Nota nota:notas) {
			sumaNotas=sumaNotas+nota.getValor();
			
		}
		System.out.println(sumaNotas/notas.size());
		
	}
	
	
}
