package ejemplo14;

public class Objeto14b_Rectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1= new Rectangulo (2,2);
		
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
		
		System.out.println(Rectangulo.area(5, 5));
	}

}
