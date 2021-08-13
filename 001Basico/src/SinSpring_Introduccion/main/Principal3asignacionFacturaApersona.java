package SinSpring_Introduccion.main;

import SinSpring_Introduccion.FactoriaFacturas;
import SinSpring_Introduccion.FactoriaPersona;
import SinSpring_Introduccion.Factura;
import SinSpring_Introduccion.Persona;

public class Principal3asignacionFacturaApersona {

	public static void main(String[] args) {
				
		Factura f1=FactoriaFacturas.getInstance("IVA");
		f1.setNumero(001);
		f1.setConcepto("mouse");
		f1.setImporte(200);
		imprimir(f1);

		Factura f2=FactoriaFacturas.getInstance("SinIva");
		f2.setNumero(002);
		f2.setConcepto("teclado");
		f2.setImporte(120);
		imprimir(f2);

		Persona p1=FactoriaPersona.getInstance("persona");
		p1.setNombre("carlos");
		Persona p2=FactoriaPersona.getInstance("persona");
		p2.setNombre("pedro");
		
		p1.setFactura(f1);
		p2.setFactura(f2);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getFactura().getImporteTotal());
		
		System.out.println(p2.getNombre());
		System.out.println(p2.getFactura().getImporteTotal());
		
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
