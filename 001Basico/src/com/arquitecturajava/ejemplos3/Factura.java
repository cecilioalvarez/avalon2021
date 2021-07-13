package com.arquitecturajava.ejemplos3;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
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

	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getImporte() {
		return importe;
	}
	public double getImporteIVA() {
		return this.importe*1.21;
	}
	public double getImporteRetencion() {
		return this.getImporte()*0.85;
	}
	public double getImporteDescuento() {
		return this.getImporte()*0.8;
	}
}
