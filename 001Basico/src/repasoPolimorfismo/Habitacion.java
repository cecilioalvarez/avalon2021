package repasoPolimorfismo;

import java.util.ArrayList;

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
		for (Bombilla bombilla : this.getBombillas()) {
			potenciaTotal += bombilla.getPotencia();
		}

		return potenciaTotal;
	}

	public void addBombilla(Bombilla b) {
		bombillas.add(b);
	}

	public void removeBombilla(Bombilla bom) {
		bombillas.remove(bom);
	}

	public Bombilla getBombillaMaxConsumo() {

		Bombilla bom = new Bombilla(0, 0, false);
		for (Bombilla bombilla : bombillas) {
			if (bom.getPotencia() < bombilla.getPotencia()) {
				bom = bombilla;
			}
		}

		return bom;
	}
}
