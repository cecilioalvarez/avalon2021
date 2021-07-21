package colecciones03;

import java.util.ArrayList;
import java.util.List;
//T: tipo de objeto
public class Bolsa<T> {
	private int tope;
	private List<T> lista = new ArrayList<T>();

	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}

	public List<T> getLista() {
		return lista;
	}

	public void setLista(List<T> lista) {
		this.lista = lista;
	}

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	
	}
	
	public void add(T o) {
		if (lista.size()<tope) {
			lista.add(o);
			
		}
	}
	public void remove(T o) {
		
			lista.remove(o);
			
	
	}

}
