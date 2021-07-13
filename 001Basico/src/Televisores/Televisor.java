package Televisores;

public class Televisor {

	private String marca;
	private double precio;
	private boolean encendido;
	
	public Televisor(String marca,double precio,boolean encendido) {
		
		this.marca=marca;
		this.precio=precio;
		this.encendido=encendido;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public void on() {
		this.encendido = true;
	}
	public void off() {
		this.encendido = false;
	}
		
}
