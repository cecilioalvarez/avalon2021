package ejercicio20;

public class PedidoBarra extends Pedido{

	public PedidoBarra(String concepto, double importe) {
		super(concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte();
	}

}
