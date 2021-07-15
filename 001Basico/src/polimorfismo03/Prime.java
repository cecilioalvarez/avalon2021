package polimorfismo03;

public class Prime extends Compra {

	public Prime(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {
		return getImporte();

	}

}
