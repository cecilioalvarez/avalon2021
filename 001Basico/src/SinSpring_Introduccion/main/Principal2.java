package SinSpring_Introduccion.main;

import SinSpring_Introduccion.FactoriaFacturas;
import SinSpring_Introduccion.FactoriaPersona;
import SinSpring_Introduccion.Factura;
import SinSpring_Introduccion.Persona;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//el que maneja las facturas en el programa main no se da cuenta de que existen clses hojas
		//todo queda encapsulado a traves del concepto de factura
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
