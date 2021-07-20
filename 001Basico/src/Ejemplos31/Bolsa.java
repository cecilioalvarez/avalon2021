package Ejemplos31;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {
	private int tope;
	private List<String> lista = new ArrayList<String>();
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(String o) {
		if (lista.size()<tope) {
			lista.add(o);
		}
	}

	public void remove(String o) {
		lista.remove(o);
	}
}