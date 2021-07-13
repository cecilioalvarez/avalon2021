package ejemplos06POO;

public class Objetos06Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura f1 = new Factura(23,"Pago de alquiler",100);
		
		System.out.println(f1.getNumF()+"-"+ f1.getImporteF()+"-"+f1.getConceptoF());
	
		System.out.println(f1.importeConIVA());
		System.out.println(f1.importeConRetenciones(20));
		System.out.println(f1.importeConDescuento(30));
	}

}
