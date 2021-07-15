package Ejemplos16Herencia;

public class CompraPrime extends Compra {

	public CompraPrime(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
	}
	
	public double getImporteTotal() {
		return getImporte();
	}
}
