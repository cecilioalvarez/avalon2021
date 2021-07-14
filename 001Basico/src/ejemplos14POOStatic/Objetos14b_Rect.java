package ejemplos14POOStatic;

public class Objetos14b_Rect {

	public static void main(String[] args) {
		
		
		
		System.out.println(Rectangulo.getArea(2, 3));
		System.out.println(Rectangulo.getPerimeter(2, 3));
		
		Rectangulo r= new Rectangulo(3,4);
		System.out.println(Rectangulo.getPerimeter(r.getLado1(), r.getLado2()));
		System.out.println(Rectangulo.getArea(r.getLado1(), r.getLado2()));
		System.out.println(r.area);
	}

}
