package com.arquitecturajava.ejemplos17;

public class PedidoWeb extends Pedido {

	public PedidoWeb(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
	}
	
	@Override
	public double getImporteFinal() {
		return getImporte()*0.8;
	}

}
