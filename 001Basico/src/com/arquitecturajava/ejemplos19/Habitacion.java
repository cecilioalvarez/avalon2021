package com.arquitecturajava.ejemplos19;

import java.util.ArrayList;
import java.util.Collections;

public class Habitacion {

	private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();

	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}

	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}

	public double getPotenciaTotal() {

		double potenciaTotal = 0;
		for (Bombilla b : this.getBombillas()) {

			potenciaTotal += b.getPotencia();

		}
		return potenciaTotal;
	}

	// sencillez que no simplicidad esta orientado a un elemento
	// a futuro puede ser que mañana en el futuro 
	// añadir una bombilla no sea lo mismo que añadir una coleccion
	public void addBombilla(Bombilla bombilla) {
			
			bombillas.add(bombilla);
			
	}
	// las cosas enrevesadas a una coleccion
	public void addBombilla(Bombilla ... bombillas) {

		Collections.addAll(this.bombillas, bombillas);
	}

	public void removeBombilla(Bombilla bombilla) {

		bombillas.remove(bombilla);
	}

}
