package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Compra> comprasTotales = new ArrayList<Compra>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Compra> getComprasTotales() {
		return comprasTotales;
	}
	public void setComprasTotales(ArrayList<Compra> comprasTotales) {
		this.comprasTotales = comprasTotales;
	}
	
	public void addCompra(Compra c) {
		comprasTotales.add(c);
	}
	
	public double getImporteTotalCompras() {
		double total = 0;
		for (Compra c: comprasTotales) {
			total += c.getImporteTotal();
		}
		return total;
	}
	
	//Con polimorfismo
	/*public Compra getCompraMasCara() {
		Compra compraCara = null;
		for(Compra c: comprasTotales) {
			if(compraCara == null || c.getImporteTotal()>compraCara.getImporteTotal()) {
				compraCara=c;
			}
		}
		return compraCara;
	}*/
	//Mismo metodo anterior sin polimorfismo.
	public double getImporteMasAlto() {
		double maximo = 0;
		for(Compra c: comprasTotales) {
			if(c.getImporteTotal()>maximo) {
				maximo = c.getImporteTotal();
			}
		}
		return maximo;
	}

}
