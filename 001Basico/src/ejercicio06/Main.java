package ejercicio06;

public class Main {

	public static void main(String[] args) {
		Caja cajita = new Caja(10, 250, 100);
		System.out.println(cajita.getVolumen());

		Caja contenedor = cajita.getCajaVolumenHuecoMin();
		System.out.println(contenedor.getAlto());
		System.out.println(contenedor.getAncho());
		System.out.println(contenedor.getProfundo());
		System.out.println(contenedor.getVolumen());
	}
}
