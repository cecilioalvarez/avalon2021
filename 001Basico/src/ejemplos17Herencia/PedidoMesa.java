package ejemplos17Herencia;

public class PedidoMesa extends Pedido {

	public PedidoMesa(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteSencillo() {
		
		return getImporte()*1.1;
	}

}
