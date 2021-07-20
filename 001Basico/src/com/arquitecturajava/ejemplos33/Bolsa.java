package com.arquitecturajava.ejemplos33;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
	private int tope;
	private List<T> lista = new ArrayList<>();
	
	public void add(T o) {
		if(lista.size()<tope) {
			lista.add(o);
		}
	}
	public void remove(T o) {
		lista.remove(o);
	}
	
	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}
	public List<T> getLista() {
		return lista;
	}
	public void setLista(List<T> lista) {
		this.lista = lista;
	}
	
}
