package ejercicio20;

public class PedidoWeb extends Pedido{

	public PedidoWeb(double precio, double importe) {
		super(precio, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte()*0.20;
	}

}
