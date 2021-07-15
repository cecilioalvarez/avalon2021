package ejemplos17Herencia;

public class PedidoBarra extends Pedido{

	public PedidoBarra(String concepto, double importe) {
		super(concepto, importe);
	}

	@Override
	public double getImporteFinal() {
		return getImporte();
	}

}
