package ejemplos17Herencia;

public abstract class Pedido {
	
	private String concepto;
	private double importe;
	private Cliente cliente;
	
	public Pedido(String concepto, double importe,Cliente cliente) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.cliente=cliente;
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



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getImporteFinal() {
		if (getCliente().esVip()) {
			return getImporteSencillo()*0.75;
		}else {
			return getImporteSencillo();
		}
	}
	
	//Este metodo lo ven clases del mismo paquete y clases hijas
	protected abstract double getImporteSencillo();
}
