package Estudio009_001POO_EjemploRectangulo;

public class ObjetoRectangulo {

	public static void main(String[] args) {
		//creamos un primer objeto llamando a la clase rectangulo
		ClaseRectangulo r1=new ClaseRectangulo();
		r1.lado1=5;
		r1.lado2=4;
		
		System.out.println(r1.lado1);
		System.out.println(r1.lado2);
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
		
		//creamos un segundo objeto llamando a la clase rectangulo
		
		ClaseRectangulo r2=new ClaseRectangulo();
		r2.lado1=2;
		r2.lado2=7;
		
		System.out.println(r2.lado1);
		System.out.println(r2.lado2);
		System.out.println(r2.area());
		System.out.println(r2.perimetro());
	}

}
