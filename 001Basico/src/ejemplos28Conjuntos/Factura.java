package ejemplos28Conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Factura {
	
	private int numero;
	private String concepto;
	//Uso de Interfaces, declaro tipo List que es la Interfaz
	private List<LineaFactura>lineasFactura = new ArrayList<LineaFactura>();
	
	
	public Factura(int numero, String concepto) {
		super();
		this.numero = numero;
		this.concepto = concepto;
	}
	
	
	
	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return numero == other.numero;
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
	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}
	public void setLineasFactura(List<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}
	
	//Metodos para ArrayList
	public void addLineaFactura(LineaFactura lineaFactura) {
		
		this.getLineasFactura().add(lineaFactura);
	}
	
	public void addLineaFactura(LineaFactura ... lineas ) {
		
		Collections.addAll(this.getLineasFactura(),lineas);
	}
	
	public void removeLineaFactura(LineaFactura lineaFactura) {
		
		this.getLineasFactura().remove(lineaFactura);
	}
	
	public double sumaImportes() {
		double sumaImportes=0;
		for (LineaFactura lineaFactura : this.getLineasFactura()) {
			sumaImportes+=lineaFactura.getImporte();
		}
		
		return sumaImportes;
	}
	
}
