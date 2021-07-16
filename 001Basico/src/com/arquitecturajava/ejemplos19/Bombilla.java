package com.arquitecturajava.ejemplos19;

import java.util.Objects;

public class Bombilla {
	private int id;
	private int potencia;
	private boolean encendida;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public boolean isEstaEncendida() {
		return encendida;
	}
	public void setEstaEncendida(boolean estaEncendida) {
		this.encendida = estaEncendida;
	}
	public Bombilla(int id, int potencia, boolean estaEncendida) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.encendida = estaEncendida;
	}
	//Crear metodos encender apagar
	public void encederBombilla() {
		System.out.println("bombilla " + id + " encendida");
		this.encendida = true;
	}
	
	public void apagarBombilla() {
		System.out.println("bombilla " + id + " apagada");
		this.encendida = false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "Bombilla [id=" + id + ", potencia=" + potencia + ", encendida=" + encendida + "]";
	}
	
}
