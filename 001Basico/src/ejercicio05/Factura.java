package ejercicio05;

public class Factura {
	private int numero;
	private String concepto;
	private double importe;

	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public Factura() {
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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double importeConIVA() {
		
		
		return this.getImporte()*1.21;
		
	}
	public double importeSinRetencion() {
		return this.getImporte() - this.getImporte()*0.15;
		
	}
	public double importeDescuento(int porcentaje) {
		
		return this.getImporte() - this.getImporte()*porcentaje/100;
		
	}
}
