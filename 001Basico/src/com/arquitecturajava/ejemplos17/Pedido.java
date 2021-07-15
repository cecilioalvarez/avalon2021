package com.arquitecturajava.ejemplos17;

public  abstract class Pedido {

	private String concepto;
	private double importe;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Pedido(String concepto, double importe) {
		super();
		this.concepto = concepto;
		this.importe = importe;
	}
	public abstract double getImporteFinal();
}
