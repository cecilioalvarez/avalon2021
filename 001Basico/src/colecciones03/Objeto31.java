package colecciones03;

public class Objeto31 {
	public static void main(String[] args) {
		Bolsa b = new Bolsa(3);
		b.add("galletas");
		b.add("tomates");
		b.add("otra");
		b.add("leche");
		
		for (Object elto : b.getLista()) {
			System.out.println(elto);
		}
	}

}
