package polimorfismoAbstract2;

import java.util.ArrayList;

public class Pared {

	ArrayList<Azulejo> misAzulejos = new ArrayList<Azulejo>();

	
	public ArrayList<Azulejo> getMisAzulejos() {
		return misAzulejos;
	}

	public void setMisAzulejos(ArrayList<Azulejo> misAzulejos) {
		this.misAzulejos = misAzulejos;
	}

	
	public Pared(ArrayList<Azulejo> misAzulejos) {
		super();
		this.misAzulejos = misAzulejos;
	}
	public Pared() {

	}

	public void addAzulejo(Azulejo azu) {
		misAzulejos.add(azu);
	}

	public double getImporteTotal() {

		double total = 0;

		for (Azulejo azulejo : misAzulejos) {
			total += azulejo.getPrecio();
		}
		return total;
	}

	public double getSuperficie() {
		double superficie = 0;
		for (Azulejo azulejo : misAzulejos) {
			superficie += azulejo.superficie();
		}
		return superficie;
	}

	public double getArea() {

		double area = 0;
		for (Azulejo azulejo : misAzulejos) {
			area += azulejo.area();
		}
		return area;
	}

}
