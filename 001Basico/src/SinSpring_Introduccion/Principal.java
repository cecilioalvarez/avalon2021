package SinSpring_Introduccion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacturaConIva f1=new FacturaConIva(001, "frigorifico", 200);
		System.out.println(f1.getImporteTotal());

		FacturaSinIva f2=new FacturaSinIva(002, "ordenador", 200);
		System.out.println(f2.getImporteTotal());
		
		System.out.println("______________________");
		
		imprimir(f1);
		imprimir(f2);
		
	}

	
	//aca hemos usado las propiedades del polimorfismo
	//hemos encapsulado los conceptos de facturaConIva y facturaSinIva
	
	//la persona que construya este codigo no sabe que tipologias de factura existen
	// esto es usar encapsulacion  a nivel de herencia
	//el programador puede imprimir sin saber la jerarquia completa de clases
	//esto le da simplicidad al codigo
	public static void imprimir (Factura factura) {
		System.out.println(factura.getImporteTotal());
	}
	
}
