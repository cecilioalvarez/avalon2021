package Estudio011_003_Composicion_Encapsulacion;

public class Principal {

	public static void main(String[] args) {

//en el ejemplom anterior debiamosm crear primero la galleta, luego el sobre 
		//a pesar que estan relacionados se manejan casi de forma independiente en el programa
		// para resolver esto utilizamos el concepto de encapsulacion
		//Galleta g=new Galleta("chocolate", 2);
		//lo que estoy haciendo es que el propio sobre se encargue de construir la galleta
		Sobre s=new Sobre("blanco","chocolate",2);
		

		System.out.println(s.getColor());
		System.out.println(s.getSabor());
		System.out.println(s.getPrecio());
		
	
	}

}
