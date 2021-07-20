package ejemplos30_Wrappers_ClasesCoraza;

public class Objetos30B_Bolsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bolsa b = new Bolsa(3);
		b.addElement("galletas");
		b.addElement("tomates");
		b.addElement("otra");
		b.addElement("leche");
		
		for (Object o : b.getLista()) {
			System.out.println(o);
		}
	}

}
