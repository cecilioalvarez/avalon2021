package ejemplos15Herencia;

public class Portatil extends Ordenador{

	private int bateria;
	
	//Constructor de su superclase: Ordenador
	public Portatil(String marca, double precio,int bateria) {
		super(marca, precio);
		this.bateria=bateria;
	}

	//Setter y Getter
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	//Metodos
	@Override
	public void encender() {
		System.out.println("El Portatil se enciende en 15 segundos.");
	}
	
	
	

	
}
