package Ejemplos16Herencia;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Compra> listadoCompras =  new ArrayList<Compra>();
	
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
	public ArrayList<Compra> getListadoCompras() {
		return listadoCompras;
	}
	public void setListadoCompras(ArrayList<Compra> listadoCompras) {
		this.listadoCompras = listadoCompras;
	}
	
	public void addCompra(Compra compra) {
		listadoCompras.add(compra);
	}
	
	public double sumaCompras() {
		double total=0;
		for (Compra compra : getListadoCompras()) {
			total+=compra.getImporteTotal();
		}
		
		return total;
	}
	
	public Compra getCompraMasCara() {
		Compra cCara = new Compra();
		for (Compra compra : getListadoCompras()) {
			if (compra.getImporteTotal()>cCara.getImporteTotal()) {
				cCara=compra;
			}
		}
		
		return cCara;
	}
	
}
