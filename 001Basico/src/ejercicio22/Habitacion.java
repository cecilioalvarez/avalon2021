package ejercicio22;

import java.util.ArrayList;

public class Habitacion {
	ArrayList<Bombilla> lista=new ArrayList<Bombilla>();

	
	public Habitacion() {
		
	}

	public ArrayList<Bombilla> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Bombilla> lista) {
		this.lista = lista;
	}
	
	public void addBombilla(Bombilla bombilla) {
		lista.add(bombilla);
	}
	public double getPotencia() {
		double potenciaTotal=0;
		for(Bombilla b: lista) {
			potenciaTotal+=b.getPotencia();
		}
		return potenciaTotal;
	}
	
	
}
