package Ejemplo21;

public class Objeto21 {

	public static void main(String[] args) {
		Habitacion h = new Habitacion();
		h.addDispositivo(new Televisor());
		h.addDispositivo(new Bombilla(1,60,true));
		h.addDispositivo(new Bombilla(2,60,true));
		h.addDispositivo(new Bombilla(3,60,true));

		for (Conectable c:h.getDispositivos()) {

			c.encender();
		}
	}
	}