package ejemplos06POO;

public class Factura {
	private int numF;
	private String conceptoF;
	private double importeF;
	
	public Factura(int numF, String conceptoF, double importeF) {
		super();
		this.numF = numF;
		this.conceptoF = conceptoF;
		this.importeF = importeF;
	}
	public int getNumF() {
		return numF;
	}
	public void setNumF(int numF) {
		this.numF = numF;
	}
	public String getConceptoF() {
		return conceptoF;
	}
	public void setConceptoF(String conceptoF) {
		this.conceptoF = conceptoF;
	}
	public double getImporteF() {
		return importeF;
	}
	public void setImporteF(double importeF) {
		this.importeF = importeF;
	}
	
	public double importeConIVA() {
		return this.getImporteF()*1.21;
	}
	
	public double importeConRetenciones(double retenciones) {
		
		return this.getImporteF()*(1-(retenciones/100));
	}
	
	public double importeConDescuento(double descuento) {
		
		return this.getImporteF()*(1-(descuento/100));
	}
	
	
	
	
	
}
