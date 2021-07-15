package com.arquitecturajava.ejemplos16;

public class CompraStandard extends Compra {

	public CompraStandard(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {
		
		return getImporte()+10;
	}
}
