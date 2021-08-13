package SinSpring_Introduccion.main;

import SinSpring_Introduccion.FactoriaFacturas;
import SinSpring_Introduccion.FactoriaPersona;
import SinSpring_Introduccion.Factura;
import SinSpring_Introduccion.Persona;

public class Principal5 {

	public static void main(String[] args) {
		
		Factura f1=FactoriaFacturas.getInstance("IVA");
		f1.setNumero(001);
		f1.setConcepto("mouse");
		f1.setImporte(200);
		
		System.out.println(f1.getImporteTotal());
		
		
		Factura f2=FactoriaFacturas.getInstance("SinIVA");
		f2.setNumero(004);
		f2.setConcepto("minitor");
		f2.setImporte(543);
		
		System.out.println(f2.getImporteTotal());

	}		
	
}
