package com.arquitecturajava.ejemplos17;

import java.util.ArrayList;

public class Cliente {

	private String nombre;

	private ArrayList<Pedido> pedidos= new ArrayList<Pedido>();
	
	
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
	
	public void addPedido (Pedido pedido) {
		
		pedidos.add(pedido);
	}
}
