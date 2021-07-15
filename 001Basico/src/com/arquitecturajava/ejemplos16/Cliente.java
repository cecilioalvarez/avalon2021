package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Compra> compras= new ArrayList<Compra>();
	public String getNombre() {
		return nombre;
	}
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Compra> getCompras() {
		return compras;
	}
	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}
	
	public void addCompra (Compra c) {
		compras.add(c);
	}
	
	public double  getImporteTotalCompras() {
		
		double total=0;
		for (Compra c : compras) {
			
			total+=c.getImporteTotal();
			
			
		}
		return total;
	}
	
	
}
