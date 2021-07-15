package ejemplos15Herencia;

public class Ordenador {

	private String marca;
	private double precio;	
	
	//Constructor
	public Ordenador(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	
	//Setter y Getter
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	public void encender() {
		System.out.println("El Ordenador enciende en 10 segundos");
	}
	
	
}
