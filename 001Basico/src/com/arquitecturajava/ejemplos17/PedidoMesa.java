package com.arquitecturajava.ejemplos17;

public class PedidoMesa extends Pedido {

	public PedidoMesa(String concepto, double importe, Cliente cliente) {
		super(concepto, importe, cliente);
		// TODO Auto-generated constructor stub
	}
	
	public double getImporteFinal() {
		// TODO Auto-generated method stub
		return getImporte()*1.10;
	}

}
