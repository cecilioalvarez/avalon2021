package Ejemplo17;

public class PedidoBarra extends Pedido {

	public PedidoBarra(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		
	}

	@Override
//	protected double getImporteSencillo() {
//			return getImporte();
//	}
	
	public double getImporteFinal() {

		//estatico
		return Pedidos.descuentoVIP( getCliente(),getImporte());
	}
	
}
