package ejercicio20;

public abstract class Pedido {
	private String concepto;
	private double importe;

	public Pedido(double precio, double importe) {
		super();
		this.importe= importe;
		
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
		this.importe= importe;
	}
	
	public abstract double getImporteFinal();
	
}
