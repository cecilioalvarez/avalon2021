package ejemplos17Herencia;

public class Objetos17 {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Pedro");
		
		cli.addPedido(new PedidoMesa("Cerveza", 10));
		cli.addPedido(new PedidoBarra("Cerveza2", 10));
		cli.addPedido(new PedidoWeb("Cerveza3", 10));
		cli.addPedido(new PedidoMesa("Coca", 10));
		cli.addPedido(new PedidoBarra("Coca2", 10));
		cli.addPedido(new PedidoMesa("Coca3", 10));
		
		System.out.println(cli.sumaPedidos());
		System.out.println("-----------------");
		for (Pedido pedido : cli.getListadoPedidos()) {
			System.out.println(pedido.getConcepto()+" "+pedido.getImporteFinal());
		}
		

	}

}
