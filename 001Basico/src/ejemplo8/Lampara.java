package ejemplo8;

public class Lampara {
	private String marca;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Lampara(String marca) {
		super();
		this.marca = marca;
	}
	
	public void encender() {
		System.out.println("la lampara ilumina con 5 lumenex");
	}
	
	public void encender(int lumenex) {
		System.out.println("la lampara ilumina con "+lumenex+" lumenex");
	}
}
