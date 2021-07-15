package ejercicio20;

public class PedidoMesa extends Pedido{

	public PedidoMesa(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double getImporteSencillo() {
		// TODO Auto-generated method stub
		return getImporte();
	}
	

}
