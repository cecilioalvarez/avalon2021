package com.arquitecturajava.ejemplo18;



public class Compra {

	private String cliente;
	private String concepto;
	private double importe;
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
	public Compra(String cliente, String concepto, double importe) {
		super();
		this.cliente = cliente;
		this.concepto = concepto;
		this.importe = importe;
	}
	
}
