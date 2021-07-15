package com.arquitecturajava.ejemplos16;

public abstract class Compra {
	private String cliente;
	private String concepto;
	private double importe;
	
	public Compra(String cliente, String concepto, double importe) {
		super();
		this.cliente = cliente;
		this.concepto = concepto;
		this.importe = importe;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
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
	
	public abstract double getImporteTotal();
	
	public Compra() {
		
	}
	
	
}
