package ejercicio31;

import java.util.ArrayList;
import java.util.List;

public class BolsaCadenas {
	
	private int tope;
	private List<String> lista=new ArrayList<String>();
	
	public BolsaCadenas() {
		super();
	}
	

	public BolsaCadenas(int tope) {
		super();
		this.tope = tope;
	}


	public int getTope() {
		return tope;
	}


	public void setTope(int tope) {
		this.tope = tope;
	}


	public List<String> getLista() {
		return lista;
	}


	public void setLista(List lista) {
		this.lista = lista;
	}


	public void add(String o) {
		lista.add(o);
	}
	
	public void remove(String o) {
		lista.remove(o);
	}

}
