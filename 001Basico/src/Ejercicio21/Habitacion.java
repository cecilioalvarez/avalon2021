package Ejercicio21;

import java.util.ArrayList;
import java.util.Collections;
public class Habitacion {
	private ArrayList<Bombilla> bombillas=new ArrayList<Bombilla>();
	
	
	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}
	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}
	
	public double getPotenciaTotal() {
		double sumaPotencia=0;
		for (Bombilla b : this.getBombillas()) {
			sumaPotencia=sumaPotencia+b.getPotencia();
		}
		return sumaPotencia;
	}
	// Metodo para añadir una bombilla
	public void addBombilla(Bombilla bombilla) {
		bombillas.add(bombilla);
	}
	// Metodo para añadir varias bombillas
	public void addBombilla(Bombilla ... bombillas) {
		Collections.addAll(this.bombillas, bombillas);
	}
	public void removeBombilla(Bombilla bombilla) {
		bombillas.remove(bombilla);
	}
	public void encender() {
		for (Bombilla b : this.getBombillas()) {
			b.encenderBombilla();
		}
	}
	public void apagar() {
		for (Bombilla b : this.getBombillas()) {
			b.apagarBombilla();
		}
	}
	public Bombilla getBombillaGastoMaximo() {
		Bombilla gastoMaximo = new Bombilla(0,-1,false);
		for (Bombilla b : this.getBombillas()) {
			if (gastoMaximo.getPotencia()<b.getPotencia()) {
				gastoMaximo=b;
			}
		}
		return gastoMaximo;
	}

}