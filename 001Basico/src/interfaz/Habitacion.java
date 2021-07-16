package interfaz;

import java.util.ArrayList;

public class Habitacion {
	
	private ArrayList<Conectable> dispositivos = new ArrayList<Conectable>();

	public ArrayList<Conectable> getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(ArrayList<Conectable> dispositivos) {
		this.dispositivos = dispositivos;
	}
	

	public void addDispositivo(Conectable conectable) {
		this.dispositivos.add(conectable);
	}
}
