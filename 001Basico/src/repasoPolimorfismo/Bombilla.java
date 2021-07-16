package repasoPolimorfismo;

import java.util.Objects;

public class Bombilla {
	private int id;
	private int potencia;
	boolean encendida;

	public Bombilla(int id, int potencia, boolean encendida) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.encendida = encendida;
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

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public void encender() {

		this.encendida = true;
	}

	public void apagar() {

		this.encendida = false;

	}

}
