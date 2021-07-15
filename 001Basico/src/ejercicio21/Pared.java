package ejercicio21;

import java.util.ArrayList;

public class Pared {
	
	ArrayList<Azulejo> azulejos=new ArrayList<Azulejo>();
	
	
	public Pared() {
		super();
		
	}

	public ArrayList<Azulejo> getAzulejos() {
		return azulejos;
	}

	public void setAzulejos(ArrayList<Azulejo> azulejos) {
		this.azulejos = azulejos;
	}
	
	public void removeAzulejo(Azulejo azulejo) {
		this.azulejos.remove(azulejo);
	}
	
	public void addAzulejo(Azulejo azulejo) {
		this.azulejos.add(azulejo);
	}
	
	public double getImporte() {
		double suma=0;
		for(Azulejo a: azulejos) {
			suma+=a.getPrecio();
		}
		return suma;
	}
	
	public double getAreaCubierta() {
		double total=0;
		for(Azulejo a: azulejos) {
			total+=a.area();
		}
		return total;
		
	}
	
	
	
}
