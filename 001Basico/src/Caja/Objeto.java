package Caja;

public class Objeto {

	public static void main(String[] args) {
		
		Caja c= new Caja(2,2,2);
		
		System.out.println("lado 1 es " + c.getLado1());
		System.out.println("lado 2 es " + c.getLado2());
		System.out.println("lado 3 es " + c.getLado3());
		System.out.println("el volumen de la caja es: " + c.getVolumen());
		
		Caja contenedor= c.getCajaVolumenHuecoMinimo();
		System.out.println("el lado 1 del contenedor es " + contenedor.getLado1());
		System.out.println("el lado 2 del contenedor es " + contenedor.getLado2());
		System.out.println("el lado 3 del contenedor es " + contenedor.getLado3());
		System.out.println("el volumen del contenedor es: " + contenedor.getVolumen());
		
		System.out.println("el volumen del contenedor mal es: " + c.getVolumenHuecoMinimo());
		
		
	}

}
