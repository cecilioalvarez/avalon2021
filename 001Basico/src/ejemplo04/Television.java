package ejemplo04;

public class Television {
	
	private String marca;
	private int precio;
	private Boolean isEncendido;
	
	public Television() {
	
	}
	public Television(String marca, int precio, Boolean isEncendido) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.isEncendido = isEncendido;
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
	public Boolean getIsEncendido() {
		return isEncendido;
	}
	public void setIsEncendido(Boolean isEncendido) {
		this.isEncendido = isEncendido;
	}
	
	public void on() {
		this.isEncendido = true;
	}
	
	public void of() {
		this.isEncendido = false;
	}
	
	
	
	

}
