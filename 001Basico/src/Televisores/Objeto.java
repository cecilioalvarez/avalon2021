package Televisores;

public class Objeto {

	public static void main(String[] args) {
		
		Televisor t= new Televisor();
		t.setMarca("samsung");
		t.setPrecio(1000);
		t.setEncendido(false);
		
		System.out.println(t.isEncendido());
		
	}

}
