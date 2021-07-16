package Ejemplo17;

public  abstract class Pedido {

	private String concepto;
	private double importe;
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	// este solo lo necesitaria en la propia jerarquia de clases



	public double getImporte() {
		return importe;
	}

	public abstract double getImporteFinal();

	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Pedido(String concepto, double importe,Cliente cliente) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.cliente= cliente;
	}

//	// metodo template
//	// este metodo es publico
//	public double getImporteFinal() {
//		//para mirarlo
//		if (getCliente().esVip()) {
//			return getImporteSencillo() *0.75;
//		}else {
//			return getImporteSencillo();
//		}
//
//	}
//	
//	// es protegido lo ven la clase que esta en el mismo package
//		// y las clases hijas
//		protected abstract  double getImporteSencillo();
	}