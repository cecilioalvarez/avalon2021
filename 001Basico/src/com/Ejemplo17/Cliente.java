package Ejemplo17;

import java.util.ArrayList;

public class Cliente {

//	cliente
//	Realiza un pedido
//	O varios pedidos
//	Si el pedido
//	Es en mesa
//	Cobramos un 10 % mas
//	Si el pedido es web
//	Hacemos un 20 % de descuento
//	Si el pedido es en barra
//	Se aplica el precio estandar
//	Un cliente
//	Puede hacer varios pedidos con el paso del tiempo
//	Por lo tanto tendrá una arraylist de pedidos
//	Querer obtener el gasto total del cliente en todos sus puedidos
//	Y si ha hecho mas de 5 pedidos
//	Se le considera vip
//	Y se le hace un descuento adicional
//	Del 25%

	private String nombre;
	private ArrayList<Pedido> pedidos= new ArrayList<Pedido>();


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
	
	public void addPedido (Pedido pedido) {

		pedidos.add(pedido);
	}

	public double getGastoFinalTotal() {

		double gastoFinal=0;
		for (Pedido p : pedidos) {

			gastoFinal+= p.getImporteFinal();

		}
		return gastoFinal;
	}

	public boolean esVip() {

		return pedidos.size()>5;
	}	
	
}
