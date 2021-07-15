package com.arquitecturajava.ejemplos17;

public class Objeto17 {

	public static void main(String[] args) {
		Cliente c= new Cliente("juan");
		c.addPedido(new PedidoBarra("pizza", 10,c));
		c.addPedido(new PedidoWeb("hamburgesa", 10,c));
		c.addPedido(new PedidoMesa("nachos", 10,c));
		c.addPedido(new PedidoBarra("pizza", 10,c));
		c.addPedido(new PedidoWeb("hamburgesa", 10,c));
		c.addPedido(new PedidoMesa("nachos", 10,c));
		
		System.out.println(c.getGastoFinalTotal());
		

	}

}
