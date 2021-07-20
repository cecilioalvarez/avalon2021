package ejercicio29;

import java.util.Objects;

public class LineasFactura {
	private int numero;
	private String concepto;
	private double importe;
	private Factura factura;
	
	public LineasFactura() {
		super();
	}
	
	public LineasFactura(int numero, Factura factura) {
		super();
		this.numero = numero;
		this.factura = factura;
	}

	public LineasFactura(int numero, String concepto, double importe, Factura f) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
		this.factura=f;
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
	
	
	
}
