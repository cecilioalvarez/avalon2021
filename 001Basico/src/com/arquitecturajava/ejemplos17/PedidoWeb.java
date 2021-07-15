package com.arquitecturajava.ejemplos17;

public class PedidoWeb extends Pedido {

	public PedidoWeb(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
	}
	
	
	public double getImporteFinal() {
		return Pedidos.descuentoVip(getCliente(), getImporte()*0.8);
	}

}
