package ejemplos17Herencia;

public class PedidoWeb extends Pedido {

	public PedidoWeb(String concepto, double importe) {
		super(concepto, importe);
		
	}

	@Override
	public double getImporteFinal() {
		return getImporte()*0.8;
	}

}
