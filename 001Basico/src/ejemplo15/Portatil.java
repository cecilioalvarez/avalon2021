package ejemplo15;

public class Portatil extends Ordenador {
	
	private int bateria;
	
	public Portatil(String marca, double precio, int bateria) {
		super(marca, precio);
		
		this.bateria=bateria;
		// TODO Auto-generated constructor stub
		
		
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
		System.out.println("el portatil se enciende en 15 segunfdos");
	}
	
	

	
}
