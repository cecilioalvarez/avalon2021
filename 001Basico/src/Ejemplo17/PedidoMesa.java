package Ejemplo17;

public class PedidoMesa  extends Pedido {

	public PedidoMesa(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
//	protected double getImporteSencillo() {
//		// TODO Auto-generated method stub
//		return getImporte()*1.10;
//	}
	public double getImporteFinal() {

		return Pedidos.descuentoVIP( getCliente(),getImporte() * 1.10);
	}
}