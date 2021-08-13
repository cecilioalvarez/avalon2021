package _017_POO_VariablesEstaticasParte2;

public class Coche {
	
	private String marca;
	private String modelo;
	private static int contador;
	
	public Coche() {
		this("toyota","yaris");
	}
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		contador++;
	}
	
	//pasamos el metodo de instancia a un metodo de clase ose le ponemos static
	public static int getContador() {
		return contador;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
