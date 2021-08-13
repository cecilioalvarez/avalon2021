package _022_Herencia_Polimorfismo;

public class TOYOTA extends Carro {

	//este metodo se llama desde la clase TOYOTA
	public TOYOTA() {
		this.modelo="toyota";
	}

	public void informacion() {
		System.out.println("este es un toyota del 2000");
	}

}