package com.arquitecturajava.ejemplos17;

public abstract class Pedido {
	
	private String concepto;
	private double importe;
	private Cliente cliente;
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pedido(String concepto, double importe, Cliente cliente) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.cliente = cliente;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public abstract double getImporteFinal(); 
		/*if (getCliente().esVip()) {
			return getImporteSencillo()*0.75;
		}else {
			return getImporteSencillo();
		}*/
	
	/*protected abstract double getImporteSencillo();*/
}
