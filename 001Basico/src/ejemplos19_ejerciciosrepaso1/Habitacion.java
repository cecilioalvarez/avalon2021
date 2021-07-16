package ejemplos19_ejerciciosrepaso1;

import java.util.ArrayList;
import java.util.Collections;

import ejemplos18Herencia.Azulejo;
import ejemplos21Interfaces.Conectable;

public class Habitacion {

	private String nombre;
	private ArrayList<Bombilla> listadoBombillas = new ArrayList<Bombilla>();
	
	public Habitacion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Bombilla> getListadoBombillas() {
		return listadoBombillas;
	}

	public void setListadoBombillas(ArrayList<Bombilla> listadoBombillas) {
		this.listadoBombillas = listadoBombillas;
	}
	
	//Dejar los 2 metodos para dar flexibilidad a Reglas de Negocio
	//API de Java separa 
	public void addBombillas(Bombilla bom) {
		this.getListadoBombillas().add(bom);
	}
	
	public void addBombillas(Bombilla ... boms) {
		Collections.addAll(listadoBombillas, boms);
	}
	
	public void removeBombillas(Conectable bom) {
		this.getListadoBombillas().remove(bom);
	}
	
	public double getPotenciaHabitacion() {
		double potenciaTotal=0;
		for (Bombilla bom : this.getListadoBombillas()) {
			potenciaTotal+=bom.getPotencia();
		}
		return potenciaTotal;
	}
	public void encenderBombillas() {
		
		for (Bombilla bom : this.getListadoBombillas()) {
			if (!bom.isOn()) {
				bom.encenderBombilla();
			}
		}
	}
	
	public void apagarBombillas() {
		
		for (Bombilla bom : this.getListadoBombillas()) {
			if (bom.isOn()) {
				bom.apagarBombilla();
			}
		}
	}

	public Bombilla getBombillaMasPotencia() {
		Bombilla bombillaMax=null;
		for (Bombilla bom : this.getListadoBombillas()) {
			if (bombillaMax ==null || bom.getPotencia() > bombillaMax.getPotencia()) {
				bombillaMax = bom;
			}
		}
		return bombillaMax;
	}
}
