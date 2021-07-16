package ejemplos21Interfaces;

import java.util.ArrayList;

public class Habitacion {

	private ArrayList<Conectable> dispositivos = new ArrayList<Conectable>();

	public ArrayList<Conectable> getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(ArrayList<Conectable> dispositivos) {
		this.dispositivos = dispositivos;
	}
	
	public void addDispositivos(Conectable conectable) {
		this.getDispositivos().add(conectable);
	}
}
