package ejercicio32;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
	
	private int tope;
	private List<T> lista=new ArrayList<T>();
	
	public Bolsa() {
		super();
	}
	

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}


	public int getTope() {
		return tope;
	}


	public void setTope(int tope) {
		this.tope = tope;
	}


	public List<T> getLista() {
		return lista;
	}


	public void setLista(List lista) {
		this.lista = lista;
	}


	public void add(T o) {
		lista.add(o);
	}
	
	public void remove(T o) {
		lista.remove(o);
	}

}
