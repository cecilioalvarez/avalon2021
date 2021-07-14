package ejemplo9;

public class Telefono {
	
	private int numero;
	private String marca;
	
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
	public Telefono(int numero, String marca) {
		super();
		this.numero = numero;
		this.marca = marca;
	}
	
	
	
	
}
