package _017_POO_VariablesEstaticas;

public class Coche {
	
	private String marca;
	private String modelo;
	
	// para resolver el problema del contador 
	//lo que tenemos que hacer es cambiar lo siguiente
	//private int contador;
	//por 
	private static int contador;
	//al hacerla static lo que hacemos es que cada ves que se construya un ibjeto este contador
	//acumulara en la clase coche y no en el objeto directamente
	
	
	//para la variable contador solo creamos el metodo get, ya que 
	//cuando creemos el objeto no vamos a pasar ningun parametro a contador
	//es por esto que solo se crea a nivel de la clase
	
	//constructor por defecto
	public Coche() {
		this("toyota","yaris");
		
	}
	
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		//incrementamos el contador
		contador++;
	}
	
	
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
