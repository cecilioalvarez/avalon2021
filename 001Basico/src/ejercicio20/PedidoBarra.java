package ejercicio20;

public class PedidoBarra extends Pedido{

	public PedidoBarra(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	protected double getImporteSencillo() {
		// TODO Auto-generated method stub
		return getImporte();
	}

}
