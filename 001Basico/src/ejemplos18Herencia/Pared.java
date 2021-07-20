package ejemplos18Herencia;

import java.util.ArrayList;
import java.util.Collections;

public class Pared {
	
	ArrayList<Azulejo> listadoAzulejos = new ArrayList<Azulejo>();
	
	public Pared() {}
	public Pared(ArrayList<Azulejo> listadoAzulejos) {
		super();
		this.listadoAzulejos = listadoAzulejos;
	}

	public ArrayList<Azulejo> getListadoAzulejos() {
		return listadoAzulejos;
	}

	public void setListadoAzulejos(ArrayList<Azulejo> listadoAzulejos) {
		this.listadoAzulejos = listadoAzulejos;
	}
	
	public void addAzulejo(Azulejo az) {
		getListadoAzulejos().add(az);
	}
	
	//funcion de argumentos variables
	public void addAzulejos(Azulejo...azs) {
		Collections.addAll(listadoAzulejos, azs);
	}
	
	public void removeAzulejo(Azulejo a) {
		listadoAzulejos.remove(a);
	}
	
	public double getAreaCubierta() {
		double areaTotal=0;
		for (Azulejo azulejo : listadoAzulejos) {
			areaTotal+=azulejo.getAreaAzulejo();
		}
		return areaTotal;
	}
	
	public double getCoste() {
		double costeTotal=0;
		for (Azulejo azulejo : listadoAzulejos) {
			costeTotal+=azulejo.getPrecio();
		}
		return costeTotal;
	}

}