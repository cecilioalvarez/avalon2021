package repasoInterfaz;

public class Pan {
	private int peso;
	private String ingrediente;
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	public Pan(int peso, String ingrediente) {
		super();
		this.peso = peso;
		this.ingrediente = ingrediente;
	}
	
	public void cocer() {
		System.out.println("El pan se cuece en 10 min");
	}

}
