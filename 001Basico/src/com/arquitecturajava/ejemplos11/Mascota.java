package com.arquitecturajava.ejemplos11;

public class Mascota {
	private String nombre;
	private Enfermedad enfermedad;

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

	public Mascota(String nombre, Enfermedad enfermedad) {
		super();
		this.nombre = nombre;
		this.enfermedad = enfermedad;
	}
}
