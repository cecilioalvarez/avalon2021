package com.arquitecturajava.ejemplos32;

import java.util.ArrayList;
import java.util.List;

public class BolsaCadenas {
	private int tope;
	private List<String> lista = new ArrayList<>();
	
	public void add(String o) {
		if(lista.size()<tope) {
			lista.add(o);
		}
	}
	public void remove(String o) {
		lista.remove(o);
	}
	
	public BolsaCadenas(int tope) {
		super();
		this.tope = tope;
	}
	public List<String> getLista() {
		return lista;
	}
	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
}
