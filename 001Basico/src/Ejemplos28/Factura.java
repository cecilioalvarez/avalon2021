package Ejemplos28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Factura {
	private int numero;
	private String concepto;
	private List<LineaFactura> lineas = new ArrayList<LineaFactura>();
	
	@Override
	public int hashCode() {
		return Objects.hash(concepto, lineas, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(concepto, other.concepto) && Objects.equals(lineas, other.lineas)
				&& numero == other.numero;
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
	public List<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public Factura(int numero, String concepto) {
		super();
		this.numero = numero;
		this.concepto = concepto;
	}
	public double getImporte() {

		double total = 0;
		for (LineaFactura lf : lineas) { 
			total += lf.getImporte();

		}
		return total;
	}
	public void addLineaFactura(LineaFactura linea) {
		this.lineas.add(linea);
	}
	public void addLineaFactura(LineaFactura... linea) {

		Collections.addAll(this.lineas, linea);
	}
	public void removeLineaFactura(LineaFactura linea) {
		this.lineas.remove(linea);
	}
}
