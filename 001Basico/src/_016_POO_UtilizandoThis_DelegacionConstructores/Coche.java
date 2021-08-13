package _016_POO_UtilizandoThis_DelegacionConstructores;

public class Coche {
	
	private String marca;
	private String modelo;
	
	//constructor por defecto
	public Coche() {
		//cuando tenemos muchas propiedades definidas por defecto
		//podemos delegar del constructor de abajo las propiedades por defecto de este constructor
		//esto ayuda mucho cuando tenemos muchas filas de parametros definidos por defecto
		//en ese caso no utilizamos lo sigueinte:
		//this.marca="toyota";
		//this.modelo="yaris";
		//sino que utilizamos el operador this para resolver eso
		this("toyota","yaris");
	}
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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
