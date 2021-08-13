package SpringProxy_POA_Facturas;


public class FacturaProxy extends Factura {

	private Factura factura;
	
	public int getNumero() {
		return factura.getNumero();
	}
	public void setNumero(int numero) {
		factura.setNumero(numero);
	}
	public String getConcepto() {
		return factura.getConcepto();
	}
	public void setConcepto(String concepto) {
		factura.setConcepto(concepto);
	}
	public double getImporte() {
		return factura.getImporte();
	}
	public void setImporte(double importe) {
		factura.setImporte(importe);
	}
	public FacturaProxy(FacturaSinIva factura) {
		this.factura=factura;
	}
	@Override
	public double getImporteTotal() {
		//añade comportamiento adicional pero tambien delega
		System.out.println("ojo se ha generado una factura sin IVA");
		return factura.getImporteTotal();
	}

}
