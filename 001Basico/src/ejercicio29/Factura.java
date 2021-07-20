package ejercicio29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factura {
	private int numero;
	private String concepto;
	private List<LineasFactura> lineas=new ArrayList<LineasFactura>();
	
	
	public Factura(int numero, String concepto) {
		super();
		this.numero = numero;
		this.concepto = concepto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public List<LineasFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineasFactura> lineas) {
		this.lineas = lineas;
	}
	
	
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", lineas=" + lineas + "]";
	}
	public double getImporte() {
		double total=0;
		for(LineasFactura lf: lineas) {
			total+=lf.getImporte();
		}
		return total;
	}
	
	public void addLineaFactura(LineasFactura linea) {
		this.lineas.add(linea);
	}
	
	public void addLineaFactura(LineasFactura... linea) {
		Collections.addAll(this.lineas, linea);
	}
	
	public void removeLineaFActura(LineasFactura linea) {
		this.lineas.remove(linea);
	}
	
	
	
	
	
	
	

}
