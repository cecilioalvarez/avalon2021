package SinSpring_Introduccion;

public abstract class Factura {
	
	private int numero;
	private String concepto;
	private double importe;
	
	public Factura() {
		super();
	}
	public Factura(int numero, String concepto, double importe) {
		super();
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
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
	
	//este metodo nos devuelve el importe total pedoendiendo del tipo de factura
	//al no saber como implementarlo en esta clase la declaramos abstract
	//ya q tendra una clase de importe con iva y otra de improte sin iva
	public abstract double getImporteTotal();

}
