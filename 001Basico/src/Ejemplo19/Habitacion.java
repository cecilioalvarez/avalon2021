package Ejemplo19;

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
	// a futuro puede ser que ma�ana en el futuro
	// a�adir una bombilla no sea lo mismo que a�adir una coleccion
	public void addBombilla(Bombilla bombilla) {
		bombillas.add(bombilla);
	}
	// las cosas enrevesadas a una coleccion
	public void addBombilla(Bombilla... bombillas) {
		Collections.addAll(this.bombillas, bombillas);
	}
	public void removeBombilla(Bombilla bombilla) {
		bombillas.remove(bombilla);
	}

	public void encender() {
		for (Bombilla b : this.getBombillas()) {

			b.encender();
		}
	}
	public void apagar() {
		for (Bombilla b : bombillas) {
			b.apagar();
		}
	}


	public Bombilla getBombillaGastoMaximo() {

		Bombilla bombillaMaximo=null;

		for (Bombilla b : this.getBombillas()) {

			if (bombillaMaximo==null || bombillaMaximo.getPotencia()<b.getPotencia()) {

				bombillaMaximo=b;
			}
		}
		return bombillaMaximo;
	}
}
