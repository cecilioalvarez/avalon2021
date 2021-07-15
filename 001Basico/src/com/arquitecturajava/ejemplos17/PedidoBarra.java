package com.arquitecturajava.ejemplos17;

public class PedidoBarra extends Pedido {

	public PedidoBarra(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}

	
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte();
	}

}
