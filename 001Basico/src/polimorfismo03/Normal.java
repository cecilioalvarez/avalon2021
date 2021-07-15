package polimorfismo03;

public class Normal extends Compra{

	public Normal(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {
		
		return getImporte() + 10;
		
	}
	
	

}
