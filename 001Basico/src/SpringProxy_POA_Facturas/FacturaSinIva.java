package SpringProxy_POA_Facturas;

class FacturaSinIva extends Factura {


	public FacturaSinIva() {
		super();
	}

	public FacturaSinIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return this.getImporte();
	}

}
