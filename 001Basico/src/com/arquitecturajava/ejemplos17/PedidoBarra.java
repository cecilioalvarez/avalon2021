package com.arquitecturajava.ejemplos17;

public class PedidoBarra extends Pedido {

	public PedidoBarra(String concepto, double importe,Cliente cliente) {
		super(concepto, importe,cliente);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getImporteFinal() {
		
		//estatico
		return Pedidos.descuentoVIP( getCliente(),getImporte());
	}

	
	
}
