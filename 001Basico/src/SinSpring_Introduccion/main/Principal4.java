package SinSpring_Introduccion.main;

import SinSpring_Introduccion.FactoriaFacturas;
import SinSpring_Introduccion.Factura;

public class Principal4 {
	
	public static void main(String[] args) {
		
		Factura f=FactoriaFacturas.getInstance("SinIVA");
		f.setImporte(200);
		f.setNumero(0004);
		f.setConcepto("papeletas");
		
		System.out.println(f.getImporteTotal());
	}

}
