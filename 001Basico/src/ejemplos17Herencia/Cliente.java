package ejemplos17Herencia;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private int numPedidos=0;
	
	private ArrayList<Pedido> listadoPedidos =  new ArrayList<Pedido>();
	
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
	
	public int getNumPedidos() {
		return numPedidos;
	}
	
	public ArrayList<Pedido> getListadoPedidos() {
		return listadoPedidos;
	}
	public void setListadoPedidos(ArrayList<Pedido> listadoPedidos) {
		this.listadoPedidos = listadoPedidos;
		numPedidos=listadoPedidos.size();			
		
	}
	
	public void addPedido(Pedido pedido) {
		listadoPedidos.add(pedido);
		numPedidos++;
	}
	
	public double sumaPedidos() {
		double total=0;
		for (Pedido pedido : getListadoPedidos()) {
			total+=pedido.getImporteFinal();
		}
		
		return total;
	}
	
	public boolean esVip() {
		if(getNumPedidos()>5) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
