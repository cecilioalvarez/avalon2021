package com.arquitecturajava.ejemplos17;

public class PedidoWeb extends Pedido {

	public PedidoWeb(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	public double getImporteFinal() {

			return Pedidos.descuentoVIP( getCliente(),getImporte() * 0.80);
		
	}
}
