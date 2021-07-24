package Estudio011_002_Composicion_RelacionUnoaUno;

public class Principal {

	public static void main(String[] args) {


		Galleta g=new Galleta("chocolate", 2);
		
		Sobre s=new Sobre();
		s.setColor("blanco");
		s.setGalleta(g);

		System.out.println(s.getColor());
		System.out.println(s.getGalleta().getSabor());
		System.out.println(s.getGalleta().getPrecio());
		
	}

}
