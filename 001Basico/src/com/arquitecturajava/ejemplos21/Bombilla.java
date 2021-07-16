package com.arquitecturajava.ejemplos21;

public class Bombilla implements Conectable {

	private int id;
	private int potencia;
	private boolean encendida;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bombilla other = (Bombilla) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Bombilla(int id, int potencia, boolean encendida) {
		super();
		this.setId(id);
		this.setPotencia(potencia);
		this.encendida=encendida;
	}
	@Override
	public String toString() {
		return "Bombilla [id=" + id + ", potencia=" + potencia + ", encendida=" + encendida + "]";
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEncendida() {
		return encendida;
	}
	
	
	public void encender() {
		System.out.println("bombilla" +id +" encendica");
		this.encendida=true;
	}
	
	public void apagar() {
		System.out.println("bombilla" +id +" apagada");
		this.encendida=false;
	}
	
	
	
}
