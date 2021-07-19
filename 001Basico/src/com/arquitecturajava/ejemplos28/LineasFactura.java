package com.arquitecturajava.ejemplos28;

import java.util.Objects;

public class LineasFactura {
	private int numero;
	private String concepto;
	private  int importe;
	private Factura factura;
	
	@Override
	public int hashCode() {
		return Objects.hash(factura, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineasFactura other = (LineasFactura) obj;
		return Objects.equals(factura, other.factura) && numero == other.numero;
	}
	
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
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
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	public LineasFactura (int numero, Factura f) {
		this.numero = numero;
		this.factura = f;
	}
	
	public LineasFactura(int numero, String concepto, int importe, Factura f) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.factura = f;
	}
	public LineasFactura() {
		super();
	}
	
	
}
