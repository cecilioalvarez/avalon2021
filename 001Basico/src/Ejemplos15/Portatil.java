package Ejemplos15;

public class Portatil extends Ordenador {
	private int bateria;
	public int getBateria() {
		return bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}


	public Portatil(String marca, double precio, int bateria) {
		super(marca, precio);
		this.bateria = bateria;
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El ordenador enciende en 15s");
	}
	
}
