package ejemplos04POO;

public class Objetos4Tele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor t1=new Televisor();
		t1.setMarca("Samsung");
		t1.setPrecio(1000);
		t1.setEncendido(true);
		
		System.out.println(t1.isEncendido());
		if (t1.isEncendido()) {
			t1.off();
			System.out.println(t1.isEncendido());
		}else {
			t1.on();
			System.out.println(t1.isEncendido());
		}
		
	}

}
