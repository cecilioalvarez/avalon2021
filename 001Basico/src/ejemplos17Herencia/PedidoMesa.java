package ejemplos17Herencia;

public class PedidoMesa extends Pedido {

	
	public PedidoMesa(String concepto, double importe) {
		super(concepto, importe);
		
	}

	@Override
	public double getImporteFinal() {
		
		return getImporte()*1.1;
	}

}
