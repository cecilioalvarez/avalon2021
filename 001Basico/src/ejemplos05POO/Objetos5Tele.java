package ejemplos05POO;

public class Objetos5Tele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor con parametros
		Televisor t1=new Televisor("Samsung",1000,true);
		//Sin Constructor con parametros:
		//t1.setMarca("Samsung");
		//t1.setPrecio(1000);
		//t1.setEncendido(true);
		
		System.out.println(t1.isEncendido());
		t1.off();
		System.out.println(t1.isEncendido());
		t1.on();
		System.out.println(t1.isEncendido());
		
	}

}
