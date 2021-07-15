package ejemplo14;

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
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}

	//constante
	
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
	
	public double getImporteConIVA() {
		// metodos y variables estaticas para copartir el codigo		
		return MatematicaFinanciera.importeConIVA(this.getImporte());
	}
	
	
}
