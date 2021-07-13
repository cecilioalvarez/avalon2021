package Rectangulo;

public class AreaRectangulo {

	public static void main(String[] args) {
		
		//Rectangulo r=new Rectangulo();
		//r.lado1=2;
		//r.lado2=4;
		//r.color="amarillo";
		//System.out.println("el area del rectangulo es "+ (r.lado1*r.lado2));
		
		Rectangulo r=new Rectangulo();
		r.lado1=8;
		r.lado2=4;
		r.color="amarillo";
		System.out.println("el area del rectangulo es "+ r.area(r.lado1,r.lado2));

	}

}
