package polimorfismoAbstract;

public class Main {
	public static void main(String[] args) {

		Cliente c = new Cliente("juan");
		c.addPedido(new PedidoEnMesa("pizza", 10, c));
		c.addPedido(new PedidoWeb("hamburgesa", 10, c));
		c.addPedido(new PedidoEnMesa("nachos", 10, c));
		c.addPedido(new PedidoEnBarra("pizza", 10, c));
		c.addPedido(new PedidoWeb("hamburgesa", 10, c));
		c.addPedido(new PedidoEnMesa("nachos", 10, c));

		System.out.println(c.getGastoTotal());

	}

}
