package com.arquitecturajava.ejemplos17;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public double getGastoFinalTotal() {
		double gastoFinal = 0;
		for(Pedido p: pedidos) {
			gastoFinal += p.getImporteFinal();
		}
		return gastoFinal;
	}
	
	public boolean esVip() {
		return pedidos.size()>5;
	}
}
