package polimorfismoAbstract;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private ArrayList<Pedido> misPedidos = new ArrayList<Pedido>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Pedido> getMisPedidos() {
		return misPedidos;
	}

	public void setMisPedidos(ArrayList<Pedido> misPedidos) {
		this.misPedidos = misPedidos;
	}

	public Cliente(String nombre, ArrayList<Pedido> misPedidos) {
		super();
		this.nombre = nombre;
		this.misPedidos = misPedidos;
	}

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;

	}

	public void addPedido(Pedido pedido) {
		misPedidos.add(pedido);
	}

	public double getGastoTotal() {

		double gastoFinal = 0;
		for (Pedido pedido : misPedidos) {
			gastoFinal += pedido.getImporteFinal();
		}
		return gastoFinal;

	}

	public boolean esvip() {
		return misPedidos.size() > 5;
	}
}
