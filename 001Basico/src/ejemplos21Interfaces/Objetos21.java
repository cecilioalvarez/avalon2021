package ejemplos21Interfaces;

public class Objetos21 {

	public static void main(String[] args) {
		
		Habitacion h = new Habitacion();
		
		h.addDispositivos(new Televisor());
		h.addDispositivos(new Bombilla(1,60,true));
		h.addDispositivos(new Bombilla(2,60,true));
		h.addDispositivos(new Bombilla(3,60,true));

		for (Conectable con : h.getDispositivos()) {
			con.encender();
		}
	}

}
