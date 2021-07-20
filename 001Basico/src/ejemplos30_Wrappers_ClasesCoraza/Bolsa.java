package ejemplos30_Wrappers_ClasesCoraza;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	private int tope;
	private List lista = new ArrayList();
	
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

	public void addElement(Object o) {
		if (lista.size()<tope) {
			lista.add(o);
		}
		
	}
	
	public void removeElement(Object o) {
		lista.remove(o);
	}
	
}
