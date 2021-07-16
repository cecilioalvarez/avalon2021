package ejercicio22;

public class Objeto22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h=new Habitacion();
		
		h.addBombilla(new Bombilla(1,12,true));
		h.addBombilla(new Bombilla(1,12,true));
		h.addBombilla(new Bombilla(1,12,true));
		h.addBombilla(new Bombilla(1,12,true));
		h.addBombilla(new Bombilla(1,12,true));
		
		System.out.println(h.getPotencia());
	}

}
