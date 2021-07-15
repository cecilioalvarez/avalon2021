package polimorfismo03;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Compra> lista = new ArrayList<Compra>();

	public Cliente(String nombre, ArrayList<Compra> lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Compra> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Compra> lista) {
		this.lista = lista;
	}

	public void addCompras(Compra compra) {

		lista.add(compra);

	}

	public double getImporteTotalCliente() {
		double total = 0;
		for (Compra compra : lista) {
			total += compra.getImporte();
		}
		return total;

	}

	public Compra getCompraMasCara() {
		Compra compraCara = null;
		for (Compra compra2 : lista) {

			if (compraCara == null || compra2.getImporteTotal() > compraCara.getImporteTotal()) {
				compraCara = compra2;
			}
		}
		return compraCara;
	}

}
