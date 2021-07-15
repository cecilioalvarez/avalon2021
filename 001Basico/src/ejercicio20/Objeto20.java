package ejercicio20;

public class Objeto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c=new Cliente("juan");
		c.addPedido(new PedidoBarra("pizza",10));
		c.addPedido(new PedidoWeb("hamburguesa",12));
		c.addPedido(new PedidoMesa("pizza",5));
		
		System.out.println(c.getGastoFinalTotal());
		

	}

}
