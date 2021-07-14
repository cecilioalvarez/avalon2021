package com.arquitecturajava.ejemplos13;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	private static int IVA=21;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public double getImporteConIva() {
		return MatematicaFinanciera.importeConIVA(this.getImporte());
	}
	
}
