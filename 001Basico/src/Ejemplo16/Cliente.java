package Ejemplo16;

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

	public double getImporteTotalCompras() {

		double total = 0;
		for (Compra c : compras) {

			total+=c.getImporteTotal();



			total += c.getImporteTotal();

		}
		return total;
	}

	public Compra getCompraMasCara() {



		Compra compraCara= new Compra();

		for (Compra c : compras) {

			if (c.getImporteTotal()>compraCara.getImporteTotal()) {
				compraCara=c;
			}

		}
		return compraCara;
	}
}
