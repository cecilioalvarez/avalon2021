package Ejemplos28;

import java.util.Objects;

public class LineaFactura {
	private int numero;
	private String concepto;
	private double importe;
	private Factura factura;
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
	public LineaFactura() {
		super();
	}
	public LineaFactura(int numero,Factura f) {
		
		this.numero=numero;
		this.factura=f;
	}
	public LineaFactura(int numero, String concepto, double importe, Factura factura) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.factura = factura;
	}
	@Override
	public int hashCode() {
		return Objects.hash(concepto, factura, importe, numero);
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
		return Objects.equals(concepto, other.concepto) && Objects.equals(factura, other.factura)
				&& Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe) && numero == other.numero;
	}
	
}
