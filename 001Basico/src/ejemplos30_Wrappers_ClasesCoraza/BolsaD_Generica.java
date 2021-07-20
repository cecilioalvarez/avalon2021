package ejemplos30_Wrappers_ClasesCoraza;

import java.util.ArrayList;
import java.util.List;

public class BolsaD_Generica<T> {
	//Creación de Clase genérica que acepta objetos tipo T
	private int tope;
	private List<T> lista = new ArrayList<T>();
	
	public BolsaD_Generica(int tope) {
		super();
		this.tope = tope;
	}

	public List<T> getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public void addElement(T o) {
		if (lista.size()<tope) {
			lista.add(o);
		}
		
	}
	
	public void removeElement(T o) {
		lista.remove(o);
	}
	
}
