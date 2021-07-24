package Ejemplo24_Herencia;

public class Pan {
	
	private double peso;
	private String ingrediente;
	//constructor
	public Pan(double peso, String ingrediente) {
		super();
		this.peso = peso;
		this.ingrediente = ingrediente;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public void cocer() {
		System.out.println("cocemos un pan normal");
	}

}
