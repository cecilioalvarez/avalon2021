package ejercicio20;

public class PedidoWeb extends Pedido{

	public PedidoWeb(String concepto, double importe,Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double getImporteSencillo() {
		// TODO Auto-generated method stub
		if(getCliente().esVip()) {
			return getImporte()*0.80*0.75;
		}else {
			return getImporte()*0.80;
		}
		
	}

	

}
