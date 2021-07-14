package com.arquitecturajava.ejemplo11;

public class Mascota {
	private String nombre;
	Enfermedad enfermedad;

	public Mascota(String nombre) {

		this.nombre = nombre;
	}

	public Mascota(String nombre, Enfermedad enfermedad) {
		super();
		this.nombre = nombre;
		this.enfermedad = enfermedad;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
