package Ejemplos16Herencia;

public class CompraPrimera extends Compra{

	public CompraPrimera(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
	}
	
	public double getImporteTotal() {
		return getImporte()-50;
	}
}
