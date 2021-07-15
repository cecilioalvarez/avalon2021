package ejercicio20;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Pedido> pedidos=new ArrayList<Pedido>();
	
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
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public double getGastoFinalTotal() {
		double gastoFinal=0;
		for (Pedido p : pedidos) {
			gastoFinal+=p.getImporteFinal();
		}
		return gastoFinal;
	}
	
	public boolean esVip() {
		if(pedidos.size()>5) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
