package com.arquitecturajava.ejemplo18;

public class CompraPrime extends Compra {

	public CompraPrime(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
	}

	public double getImporteTotal() {

		return getImporte();
	}
}