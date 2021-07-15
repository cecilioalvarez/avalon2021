package com.arquitecturajava.ejemplo18;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	
	private ArrayList<Compra> compras=new ArrayList<Compra>();
	
	
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
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
	
	public void addCompra(Compra compra) {
		this.compras.add(compra);
	}

	public double getImporteTotalCompras() {
		double total=0;
		for(Compra c :compras) {
			total+=c.getImporte();
		}
		return total;
	}
	


	public Compra getCompraMasCara() {
		
		Compra compraCara=new Compra();
		for(Compra c : compras) {
			if(c.getImporte()>compraCara.getImporte()) {
				compraCara=c;
			}
		}
		
		return compraCara;
		
		
	}
	
	
	

}
