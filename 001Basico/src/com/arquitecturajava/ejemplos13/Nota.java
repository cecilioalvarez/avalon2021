package com.arquitecturajava.ejemplos13;

public class Nota {

	private String asignatura;
	private int valor;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nota(String asignatura, int valor) {
		super();
		this.asignatura = asignatura;
		this.valor = valor;
	}
	
	public Nota (String asignatura) {
		
		this.asignatura=asignatura;
		
	}
	
	
	@Override
	public String toString() {
		return "Nota [asignatura=" + asignatura + ", valor=" + valor + "]";
	}

}
