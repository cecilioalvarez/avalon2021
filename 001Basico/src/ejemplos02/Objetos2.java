package ejemplos02;

public class Objetos2 {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.lado = 2;
		r.lado2 = 4;
		System.out.println("Area: " + r.area(2.5, 3.5));
		System.out.println("Area: " + r.area2());
	}

}
