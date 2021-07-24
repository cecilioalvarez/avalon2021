package Televisores;

public class Objeto {

	public static void main(String[] args) {
		
		Televisor t= new Televisor("samsung",1000,true);
		//t.setMarca("samsung");
		//t.setPrecio(1000);
		//t.setEncendido(false);
		
		System.out.println(t.isEncendido());
		t.on();
		System.out.println(t.isEncendido());
		t.off();
		System.out.println(t.isEncendido());
	}

}
