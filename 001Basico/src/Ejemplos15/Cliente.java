package Ejemplos15;

import java.util.ArrayList;

import Ejemplo13.Nota;

public class Cliente extends Compra {
	private String nombre;
	private ArrayList<Compra> compra=new ArrayList<Compra>();

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Compra> getCompra() {
		return compra;
	}
	public void setCompra(ArrayList<Compra> compra) {
		this.compra = compra;
	}
	public Cliente(String cliente, String concepto, double importe) {
		super(cliente, concepto, importe);
		// TODO Auto-generated constructor stub
		this.compra=compra;
	}
	public void anadoCompras(Compra nuevaCompra) {
		compra.add(nuevaCompra);
	}
	public double sumaCompras() {
		double suma=0;
		for (Compra com : compra) {
			suma=suma+com.getImporte();
		}
		return suma;
	}
}
