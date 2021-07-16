package Ejemplo16;

public class CompraPrimera extends Compra {

	public CompraPrimera(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {

		return getImporte()-30;
	}

}