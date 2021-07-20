package Ejemplos31;

public class Objetos31 {

	public static void main(String[] args) {
		Bolsa b = new Bolsa(3);
		
		b.add("galletas");
		b.add("tomates");
		b.add("otra");
		b.add("leche");
		
		for (Object o : b.getLista()) {
			System.out.println(o);
		}
	}

}
