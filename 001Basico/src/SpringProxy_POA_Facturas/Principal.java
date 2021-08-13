package SpringProxy_POA_Facturas;

public class Principal {

	public static void main(String[] args) {
		
		Factura f=FactoriaFacturas.getInstance("IVA");
		f.setNumero(0003);
		f.setConcepto("impresora");
		f.setImporte(300);
		
		System.out.println(f.getImporteTotal());
		
		Factura f1=FactoriaFacturas.getInstance("SinIVA");
		f1.setNumero(0004);
		f1.setConcepto("lampara");
		f1.setImporte(200);
		
		System.out.println(f1.getImporteTotal());
			
			
	}

}
