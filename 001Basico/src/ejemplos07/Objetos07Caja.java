package ejemplos07;

public class Objetos07Caja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja c = new Caja(10, 2, 2);
		
		System.out.println(c.calculoVolumen());
		//System.out.println("Volumen necesario "+c.calculoVolumenHuecoMinimo());
		Caja contenedor = c.calculoVolumenHuecoMinimo();
		System.out.println(contenedor.getLado1());
		System.out.println(contenedor.getLado2());
		System.out.println(contenedor.getLado3());
		System.out.println(contenedor.calculoVolumen());
	}

}
