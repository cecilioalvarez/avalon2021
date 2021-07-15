package ejemplos18Herencia;

import java.util.ArrayList;

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
