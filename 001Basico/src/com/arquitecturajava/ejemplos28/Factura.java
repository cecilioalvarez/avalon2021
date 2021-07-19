package com.arquitecturajava.ejemplos28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Factura {
	private int numero;
	private String concepto;
	private List<LineasFactura> lineas = new ArrayList<LineasFactura>();
	
	
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
	public List<LineasFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineasFactura> lineas) {
		this.lineas = lineas;
	}
	public Factura(int numero, String concepto) {
		super();
		this.numero = numero;
		this.concepto = concepto;
	}
	
	public double getImporte() {
		double total = 0;
		for(LineasFactura lf: lineas) {
			total += lf.getImporte();
		}
		return total;
	}
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", lineas=" + lineas + "]";
	}
	
	public void addLineasFatura(LineasFactura linea) {
		this.lineas.add(linea);
	}
	
	public void addLineasFatura(LineasFactura... linea) {
		Collections.addAll(this.lineas, linea);
	}
	
	public void removeLineasFactura(LineasFactura linea) {
		this.lineas.remove(linea);
	}
	
	
}
