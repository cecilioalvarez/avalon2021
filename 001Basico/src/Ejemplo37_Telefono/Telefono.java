package Ejemplo37_Telefono;

public class Telefono {
	
	private int numero;
	private String marca;
	private double importe;
	private static DBConection helper = new DBConection();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	

}
