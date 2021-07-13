package com.arquitecturajava.ejemplo05;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;
	
	public Factura(int numero, String concepto, double importe) {
		this.setNumero(numero);
		this.setConcepto(concepto);
		this.setImporte(importe);
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
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public double importeConIVA() {
		return (double)this.getImporte()+(this.getImporte()*21/100);
		
	}
	public double importeConDescuento() {
		return (double)this.getImporte()-(this.getImporte()*20/100);
		
	}
	
	
	
	
}
