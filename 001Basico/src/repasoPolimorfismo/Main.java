package repasoPolimorfismo;

public class Main {
	public static void main(String[] args) {
		
		Habitacion hab = new Habitacion();
		hab.addBombilla(new Bombilla(1, 60, true));
		hab.addBombilla(new Bombilla(2, 80, false));
		hab.addBombilla(new Bombilla(3, 50, true));
		hab.addBombilla(new Bombilla(4, 90, false));
		
		System.out.println(hab.getPotenciaTotal());

		
	}

}
