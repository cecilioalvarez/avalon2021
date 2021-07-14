package com.arquitecturajava.ejemplo13;

import java.util.ArrayList;

public class Objeto13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		listaPersonas.add(new Persona("Francisco",40));
		listaPersonas.add(new Persona("Alejandra",35));
		listaPersonas.add(new Persona("German",31));
		listaPersonas.add(new Persona("Botero",30));
		listaPersonas.add(new Persona("Gustavo",30));
		for(int i=0;i<listaPersonas.size();i++) {
			System.out.println(listaPersonas.get(i).getNombre());
		}
		

	}

}
