package herencia;

public class Portatil extends Ordenador {
	private int bateria;

	public Portatil(String marca, int precio, int bateria) {
		super(marca, precio);
		this.bateria = bateria;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El portatil enciende en 15 sg");
	}
	
	
	
	
	

}
