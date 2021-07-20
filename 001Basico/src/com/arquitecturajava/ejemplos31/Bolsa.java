package com.arquitecturajava.ejemplos31;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
	private int tope;
	private List lista = new ArrayList<>();
	
	public void add(Object o) {
		if(lista.size()<tope) {
			lista.add(o);
		}
	}
	public void remove(Object o) {
		lista.remove(o);
	}
	
	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	public List getLista() {
		return lista;
	}
	public void setLista(List lista) {
		this.lista = lista;
	}
	
}
