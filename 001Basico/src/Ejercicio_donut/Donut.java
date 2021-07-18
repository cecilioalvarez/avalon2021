package Ejercicio_donut;

public class Donut {
	private String sabor;
	private double precio;
	public Donut(String sabor, double precio) {
		super();
		this.sabor = sabor;
		this.precio = precio;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}