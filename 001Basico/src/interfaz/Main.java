package interfaz;

public class Main {
	public static void main(String[] args) {
		Habitacion hab = new Habitacion();
		hab.addDispositivo(new Televisor());
		hab.addDispositivo(new Bombilla(1,60,true));
		hab.addDispositivo(new Bombilla(2,80,false));
		hab.addDispositivo(new Bombilla(3,100,true));
		
		for (Conectable c : hab.getDispositivos()) {
			c.encender();
		}

	}

}
