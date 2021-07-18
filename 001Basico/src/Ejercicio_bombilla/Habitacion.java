package Ejercicio_bombilla;

import java.util.ArrayList;
import java.util.Collections;

public class Habitacion {
	private ArrayList<Bombilla> bombillas = new ArrayList<Bombilla>();

	public Habitacion(ArrayList<Bombilla> bombillas) {
		super();
		this.bombillas = bombillas;
	}

	public ArrayList<Bombilla> getBombillas() {
		return bombillas;
	}

	public void setBombillas(ArrayList<Bombilla> bombillas) {
		this.bombillas = bombillas;
	}

	public double sumaPotencia() {
		double suma = 0;
		for (int i = 0; i < bombillas.size(); i++) {

			suma = suma + bombillas.get(i).getPotencia();
		}
		return suma;
	}

	public void addBombilla(Bombilla bombilla) {
		bombillas.add(bombilla);
	}
	public void addBombilla(Bombilla ... bombillas ) {
		Collections.addAll(this.bombillas,bombillas);
	}

	public void removeBombilla(Bombilla bombilla) {
		bombillas.remove(bombilla);
	}
	public void encenderTodas() {
		for (int i = 0; i < bombillas.size(); i++) {
			if (!bombillas.get(i).isEstaEncendida()) {
				bombillas.get(i).encenderBombilla();
			}
		}
	}
	public void apagarTodas() {
		for (int i = 0; i < bombillas.size(); i++) {
			if (bombillas.get(i).isEstaEncendida()) {
				bombillas.get(i).apagarBombilla();
			}
		}
	}
	/*
	 * Seria interesante un metodo para anadir bombillas, para no tener que hacerlo
	 * en el ejecutable
	 */
	public Bombilla masGasta() {
		Bombilla max = new Bombilla(0, 0, false);
		for (int i = 0; i < bombillas.size(); i++) {
			if (bombillas.get(i).getPotencia() > max.getPotencia()) {
				max = bombillas.get(i);
			}
		}
		return max;
	}
}
