package com.arquitecturajava.ejemplos18;

import java.util.ArrayList;
import java.util.Collections;

public class Pared {
	private ArrayList<Azulejo> lista = new ArrayList<Azulejo>();

	public ArrayList<Azulejo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Azulejo> lista) {
		this.lista = lista;
	}
	
	public void addAzulejo(Azulejo a) {
		lista.add(a);
	}
	
	//var args argumentos variables
	public void addAzulejo(Azulejo...azulejos) {
		Collections.addAll(lista, azulejos);
	}
	
	public void removeAzulejo(Azulejo a) {
		lista.remove(a);
	}
	
	public double area() {
		double total = 0;
		for(Azulejo a: lista) {
			total += a.area();
		}
		return total;
	}
}
