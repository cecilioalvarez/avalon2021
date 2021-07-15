package ejemplos17Herencia;

public class PedidoBarra extends Pedido{


	public PedidoBarra(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteSencillo() {
		return getImporte();
	}

}
