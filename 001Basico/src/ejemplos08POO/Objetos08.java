package ejemplos08POO;

public class Objetos08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lampara lamp = new Lampara("m1");
		lamp.encender();
		lamp.encender(3);
		
		Lampara lamp2 = new Lampara();
		lamp.encender();
		lamp.encender(3);
		
		Lampara lamp3 = new Lampara("m2",200);
		lamp.encender();
		lamp.encender(3);
	}

}
