package polimorfismo03;

public class PrimeraCompra extends Compra {

	public PrimeraCompra(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {
		return getImporte() - 30;

	}

}
