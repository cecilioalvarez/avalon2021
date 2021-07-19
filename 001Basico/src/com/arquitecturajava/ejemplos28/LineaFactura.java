package com.arquitecturajava.ejemplos28;

public class LineaFactura {

	private int numero;
	private String concepto;
	private double importe;
	private Factura factura;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + numero;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaFactura other = (LineaFactura) obj;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public LineaFactura() {
		super();
	}
	public LineaFactura(int numero,Factura f) {
		
		this.numero=numero;
		this.factura=f;
	}
	public LineaFactura(int numero, String concepto, double importe, Factura f) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.factura= f;
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
}
