package polimorfismoAbstract2;

public class Azulejo {
	private int lado1;
	private int lado2;
	private double precio;
	private String color;

	public Azulejo(int lado1, int lado2, double precio, String color) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.precio = precio;
		this.color = color;
	}


	public Azulejo(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	
	}
	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
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
	
	public double superficie() {
		return lado1*2 + lado2*2;
	}
}
