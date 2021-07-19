package EjercicioFactura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Factura {
	private double importe;
	private String concepto;
	private List<LineaFactura> lineas = new ArrayList<LineaFactura>();
	public Factura(double importe, String concepto) {
		super();
		this.importe = importe;
		this.concepto = concepto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	@Override
	public String toString() {
		return "Factura [concepto=" + concepto + ", importe=" + importe + ", lineas=" + lineas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(concepto, importe, lineas);
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
		return Objects.equals(concepto, other.concepto)
				&& Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe)
				&& Objects.equals(lineas, other.lineas);
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public List<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public double getImporte() {
		double total=0;
		for (LineaFactura lf: lineas) {
			total+=lf.getImporte();
			
		}
		return total;
	}
	public void addLineaFactura(LineaFactura linea) {
		this.lineas.add(linea);
	}
	public void addLineaFactura(LineaFactura... linea) {

		Collections.addAll(this.lineas, linea);
	}
	public void removeLineaFactura(LineaFactura linea) {
		this.lineas.remove(linea);
	}
}
