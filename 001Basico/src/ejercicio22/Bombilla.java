package ejercicio22;

import java.util.Objects;

public class Bombilla implements Conectable {
	private int id;
	private double potencia;
	private boolean estaEncendida;
	
	
	public Bombilla(int id, double potencia, boolean estaEncendida) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.estaEncendida = estaEncendida;
	}
	
	
	public Bombilla() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	public boolean isEstaEncendida() {
		return estaEncendida;
	}


	public void setEstaEncendida(boolean estaEncendida) {
		this.estaEncendida = estaEncendida;
	}


	public void encender() {
		System.out.println("bombilla "+id +" encendida");
		this.setEstaEncendida(true);
		
	}
	public void apagar() {
		System.out.println("bombilla "+id +" apagada");
		this.setEstaEncendida(false);
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
		return "Bombilla [id=" + id + ", potencia=" + potencia + ", estaEncendida=" + estaEncendida + "]";
	}
	
	

}
