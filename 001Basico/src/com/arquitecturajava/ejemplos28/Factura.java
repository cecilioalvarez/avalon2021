package com.arquitecturajava.ejemplos28;

import java.util.ArrayList;
import java.util.List;

public class Factura {

	private int numero;
	private String concepto;
	//la capacidad de manejo de interfaces
	// ya no declaro la lista como arrayList a nivel de variable
	private List<LineaFactura> lineas= new ArrayList<LineaFactura>();
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
		
		double total=0;
		for (LineaFactura lf: lineas) {
				total+=lf.getImporte();
			
		}
		return total;
	}
}
