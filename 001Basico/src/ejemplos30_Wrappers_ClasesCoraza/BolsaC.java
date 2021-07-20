package ejemplos30_Wrappers_ClasesCoraza;

import java.util.ArrayList;
import java.util.List;

public class BolsaC {

	private int tope;
	private List<String> lista = new ArrayList<String>();
	
	public BolsaC(int tope) {
		super();
		this.tope = tope;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

	public void addElement(String o) {
		if (lista.size()<tope) {
			lista.add(o);
		}
		
	}
	
	public void removeElement(String o) {
		lista.remove(o);
	}
	
}
