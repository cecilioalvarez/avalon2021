package ejemplos14POOStatic;

public class Rectangulo {

	private int lado1;
	private int lado2;
	
	public Rectangulo(int lado1, int lado2) {
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
	
	public static double getArea(int lado1,int lado2) {
		
		return lado1*lado2;
		
	}
	
	public static double getPerimeter(int lado1,int lado2) {
		return (lado1*2)+(lado2*2);
		
	}
	
	public double getArea() {
		
		return getArea(getLado1(),getLado2());
		
	}
	
	public double getPerimeter() {
		return getPerimeter(getLado1(),getLado2());
		
	}
}
