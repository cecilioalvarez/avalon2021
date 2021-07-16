package ejemplos19_ejerciciosrepaso1;

import java.util.Objects;

public class Bombilla {

	private int id;
	private int potencia;
	private boolean on;
	
	
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

	public Bombilla(int id, int potencia, boolean estaOn) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.on = estaOn;
	}

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

	
	public boolean isOn() {
		return on;
	}

	public void encenderBombilla() {
		System.out.println("Bombilla "+id+" encendida");
		this.on = true;
	}
	
	public void apagarBombilla() {
		System.out.println("Bombilla "+id+" apagada");
		this.on = false;
	}
}
