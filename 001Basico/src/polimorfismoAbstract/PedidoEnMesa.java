package polimorfismoAbstract;

public class PedidoEnMesa extends Pedido{



	public PedidoEnMesa(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double getImporteSencillo() {
		// TODO Auto-generated method stub
		return getImporte()*1.10;
	}

}
