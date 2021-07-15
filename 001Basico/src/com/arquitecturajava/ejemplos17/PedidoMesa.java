package com.arquitecturajava.ejemplos17;

public class PedidoMesa extends Pedido {

	public PedidoMesa(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}
	
	public double getImporteFinal() {
		return Pedidos.descuentoVip(getCliente(), getImporte()*1.10);
	}

}
