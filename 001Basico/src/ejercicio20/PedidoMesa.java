package ejercicio20;

public class PedidoMesa extends Pedido{

	public PedidoMesa(double precio, double importe) {
		super(precio, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte()*1.10;
	}
	

}
