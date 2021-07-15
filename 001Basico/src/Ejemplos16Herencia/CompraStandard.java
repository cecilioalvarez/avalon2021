package Ejemplos16Herencia;

public class CompraStandard extends Compra {


	public CompraStandard(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
	}
	
	public double getImporteTotal() {
		return getImporte()+10;
	}
	
	
}
