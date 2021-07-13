package com.arquitecturajava.ejemplos6;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;
	
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
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public Factura(int numero, String concepto, double importe) {
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public double getImporteConIva() {
		return this.getImporte()*1.21;
	}
	
	public double getImporteConRetencion() {
		return this.getImporte() - this.getImporte()*0.15;
	}
	
	public double getImporteConDescuento(int porcentaje) {
		return this.getImporte()-this.getImporte()*porcentaje/100;
	}
}
