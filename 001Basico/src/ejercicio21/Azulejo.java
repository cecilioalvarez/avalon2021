package ejercicio21;

import java.util.Objects;

public class Azulejo {
	private double lado1;
	private double lado2;
	private double precio;
	private String color;
	public Azulejo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double area() {
		return lado1*lado2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lado1, lado2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Azulejo other = (Azulejo) obj;
		return Double.doubleToLongBits(lado1) == Double.doubleToLongBits(other.lado1)
				&& Double.doubleToLongBits(lado2) == Double.doubleToLongBits(other.lado2);
	}
	
	
}
