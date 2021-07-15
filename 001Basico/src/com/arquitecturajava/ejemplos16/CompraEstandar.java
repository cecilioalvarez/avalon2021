package com.arquitecturajava.ejemplos16;

public class CompraEstandar extends Compra {
	
	public CompraEstandar(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public CompraEstandar() {
		
	}
	
	public double getImporteTotal() {
		return getImporte()+10;
	}
	
	

}
