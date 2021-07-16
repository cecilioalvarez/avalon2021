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
	public void removeBombilla(Conectable bombilla) {
		lista.remove(bombilla);
	}
	public double getPotenciaTotal() {
		double potenciaTotal=0;
		for(Bombilla b: lista) {
			potenciaTotal+=b.getPotencia();
		}
		return potenciaTotal;
	}
	
	public Conectable getBombillaMayorPotencia() {
		Bombilla mayor=new Bombilla();
		for(Bombilla b : lista) {
			if(b.getPotencia()>mayor.getPotencia()) {
				mayor=b;
				
			}
		}
		return mayor;
	}
	
	public void apagarHabitacion() {
		for(Conectable b : lista) {
			b.apagar();
		}
	}
	
	public void encenderHabitacion() {
		for(Conectable b : lista) {
			b.encender();
		}
	}
	
	
}
