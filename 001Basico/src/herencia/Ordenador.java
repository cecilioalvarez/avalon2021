package herencia;

public class Ordenador {
	
	private String marca;
	private int precio;
	
	public Ordenador(String marca, int precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void encender() {
		System.out.println("El ordenador enciende en 10 sg");
	}
	
	

}
