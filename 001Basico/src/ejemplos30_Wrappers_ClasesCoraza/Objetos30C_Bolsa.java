package ejemplos30_Wrappers_ClasesCoraza;

public class Objetos30C_Bolsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BolsaC b = new BolsaC(3);
		b.addElement("galletas");
		b.addElement("tomates");
		b.addElement("otra");
		b.addElement("leche");
		
		for (String cadena : b.getLista()) {
			System.out.println(cadena.toUpperCase());
		}
	}

}
