package ejemplo16;

public class CompraStandard extends Compra{
	 
	private double importedeenvio;

	public CompraStandard(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}
	
	public double getImporteTotal() {
		
		return getImporte()+10;
	}
	 

	
	
}
