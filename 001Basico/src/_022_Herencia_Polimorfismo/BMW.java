package _022_Herencia_Polimorfismo;

public class BMW extends Carro {

	//este metodo se llama desde la clase
	public BMW() {
		this.modelo="BMW";
	}

	public void turbo() {
		System.out.println("acabas de viajar a 100 km/h");
	}

	public void informacion() {
		System.out.println("este es un BMW del 2011");
	}

}
