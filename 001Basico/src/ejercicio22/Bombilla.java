package ejercicio22;

public class Bombilla {
	private int id;
	private double potencia;
	private boolean estaEncendida;
	
	
	public Bombilla(int id, double potencia, boolean estaEncendida) {
		super();
		this.id = id;
		this.potencia = potencia;
		this.estaEncendida = estaEncendida;
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
		this.setEstaEncendida(true);
		
	}
	public void apagar() {
		this.setEstaEncendida(false);
	}

}
