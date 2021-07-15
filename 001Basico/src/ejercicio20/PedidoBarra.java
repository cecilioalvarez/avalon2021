package ejercicio20;

public class PedidoBarra extends Pedido{

	public PedidoBarra(double precio, double importe) {
		super(precio, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte();
	}

}
