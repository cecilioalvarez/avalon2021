package SinSpring_Introduccion;

class FacturaConIva extends Factura {

	
	
	public FacturaConIva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacturaConIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteTotal() {
		// TODO Auto-generated method stub
		return this.getImporte()*1.21;
	}

}
