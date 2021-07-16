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
	
	
	//Encender apagar todas las bombillas de la habitacion
	//calcular la potencia total de la habitacion
	public double getPotenciaTotal() {
		double potenciaTotal= 0;
		for(Bombilla b: this.bombillas) {
			potenciaTotal+=b.getPotencia();
		}
		return potenciaTotal;
	}
	
	//Dos metodos iguales, en uno añades una bombilla y en otro una colleccion
	//sencillez que no es simplicidad
	public void addBombilla(Bombilla bombilla) {
		bombillas.add(bombilla);
	}
	//Las cosas enrevesadas
	public void addBombilla(Bombilla ... bombillas) {
		Collections.addAll(this.bombillas, bombillas);
	}
	
	public void removeBombilla(Bombilla bombilla) {
		bombillas.remove(bombilla);
	}
	
	public void getBombillaMaxConsumo() {
		double maxConsumo = 0;
		int idBombilla = 0;
		for(Bombilla b: this.bombillas) {
			if(maxConsumo<b.getPotencia()) {
				maxConsumo = b.getPotencia();
				idBombilla = b.getId();
			}
		}
		
		System.out.println("La bombilla " + idBombilla + " es la que mas gasta con un consumo de " + maxConsumo);
	}
	
	//Manera Cecilio
	/*public Bombilla getBombillaGastoMaximo() {
		Bombilla bombillaMaximo = null;
		for(Bombilla b: this.getBombillas()) {
			if(bombillaMaximo == null || )
		}
	}*/
	
	//metodo apagar todas las bombillas
	public void apagarBombillas() {
		for(Bombilla b: this.bombillas) {
			b.apagarBombilla();
		}
	}
	
	public void encenderBombillas() {
		for(Bombilla b: this.bombillas) {
			b.encederBombilla();
		}
	}
	
}
