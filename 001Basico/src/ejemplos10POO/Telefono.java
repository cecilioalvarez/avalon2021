package ejemplos10POO;

public class Telefono {

	private String marca;
	private int numero;
	
	public Telefono(String marca, int numero) {
		super();
		this.marca = marca;
		this.numero = numero;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}