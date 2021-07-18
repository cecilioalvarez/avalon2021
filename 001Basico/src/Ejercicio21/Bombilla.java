package Ejercicio21;

import java.util.Objects;

public class Bombilla implements Conectable {
	private double id;
	private double potencia;
	private boolean estaEncendida;
	public Bombilla(double id, double potencia, boolean estaEncendida) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.estaEncendida = estaEncendida;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public void encenderBombilla() {
		System.out.println("Bombilla con id "+ id+ " encendida");
		estaEncendida=true;
	}
	@Override
	public void apagarBombilla() {
		System.out.println("Bombilla con id "+ id+ " apagada");
		estaEncendida=false;
	}
	public boolean encendida() {
		return estaEncendida;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(estaEncendida, id, potencia);
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
		return estaEncendida == other.estaEncendida && Double.doubleToLongBits(id) == Double.doubleToLongBits(other.id)
				&& Double.doubleToLongBits(potencia) == Double.doubleToLongBits(other.potencia);
	}
	
}
