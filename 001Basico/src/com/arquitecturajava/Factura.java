
package com.arquitecturajava;

public class Factura {

	private int numero;
	private String concepto;
	private double importe;
	
	public Factura(int numero, String concepto, double importe) {
		
		this.numero=numero;
		this.concepto=concepto;
		this.importe=importe;
	}
	
	public int getNumero() {
		return numero;
	}
	// el metodo set asigna el valor
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setPrecio(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {		
		this.importe=importe;

	}
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero=numero;
		this.concepto=concepto;
				this.importe=importe;
	}
	public double getImporteConIVA() {
		return this.getImporte()*1.21;
	}
	public double getImporteRetencion() {
		return this.getImporte()-this.getImporte()*0.15;
	}
	public double getImporteConDescuento(int porcentaje) {
		return this.getImporte()-this.getImporte()*porcentaje/100;

}
	

	

	}