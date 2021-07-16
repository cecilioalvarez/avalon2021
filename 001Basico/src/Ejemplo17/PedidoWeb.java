package Ejemplo17;

public class PedidoWeb extends Pedido {

	public PedidoWeb(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	// TODO Auto-generated method stub
//	public double getImporteSencillo() {
//
//		return getImporte() *0.80;
//	}
	public double getImporteFinal() {

		return Pedidos.descuentoVIP( getCliente(),getImporte() * 0.80);
	}
}
