
package com.arquitecturajava;

public class Factura {

	private double numero;
	private String concepto;
	private double importe;
	
	public Factura(double numero, String concepto, double importe) {
		
		this.numero=numero;
				this.concepto=concepto;
				this.importe=importe;
	}
	
	public double getNumero() {
		return numero;
	}
	// el metodo set asigna el valor
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setPrecio(String concepto) {
		this.concepto = concepto;
	}
	public double GetImporte() {
		return importe;
	}
	public void setImporte(double importe) {		
		this.importe=importe;

	}
	

	

	}

