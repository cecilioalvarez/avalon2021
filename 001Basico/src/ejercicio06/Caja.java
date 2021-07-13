package ejercicio06;

public class Caja {
	private double alto;
	private double ancho;
	private double profundo;
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getProfundo() {
		return profundo;
	}
	public void setProfundo(double profundo) {
		this.profundo = profundo;
	}
	public Caja(double alto, double ancho, double profundo) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundo = profundo;
	}
	
	public Caja() {

	}
	public double getVolumen() {
		return this.getAncho()*this.getAlto()*this.getProfundo();
		
	}
	


}
