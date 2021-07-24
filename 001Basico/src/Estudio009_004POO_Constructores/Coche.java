package Estudio009_004POO_Constructores;

public class Coche {
	
	private String marca;
	private String modelo;
	
	//vamos a utilizar un constructor que nos ayude a simplificar el codigo
	//para no tener que utilizar tanto el metodo set para llamar las variables
	
	public Coche(String marca, String modelo) {
		this.marca=marca;
		this.modelo=modelo;
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
