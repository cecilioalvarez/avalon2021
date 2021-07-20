package ejemplos30_Wrappers_ClasesCoraza;

public class Objetos30D_Bolsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BolsaD_Generica<String> b = new BolsaD_Generica<String>(3);
		b.addElement("galletas");
		b.addElement("tomates");
		b.addElement("otra");
		b.addElement("leche");
		
		for (String cadena : b.getLista()) {
			System.out.println(cadena.toUpperCase());
		}
		
		System.out.println("----------------------------------");
		
		BolsaD_Generica<ProductoD> b2 = new BolsaD_Generica<ProductoD>(3);
		b2.addElement(new ProductoD("peras"));
		b2.addElement(new ProductoD("anchoas"));
		b2.addElement(new ProductoD("tomates"));
		
		for (ProductoD p : b2.getLista()) {
			System.out.println(p.getNombre());
		}
		
		
	}

}
