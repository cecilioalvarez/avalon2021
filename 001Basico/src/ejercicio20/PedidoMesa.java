package ejercicio20;

public class PedidoMesa extends Pedido{

	public PedidoMesa(String concepto, double importe) {
		super(concepto, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte()*1.10;
	}
	

}
