package ejemplo6;

public class Factura {
	private String concepto;
	private double importe;
	private boolean pagada;
	
	public Factura(String motivo, double importe, boolean pagada) {
		super();
		this.concepto = motivo;
		this.importe = importe;
		this.pagada = pagada;
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

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	
	
}
