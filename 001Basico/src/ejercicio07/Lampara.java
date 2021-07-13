package ejercicio07;

public class Lampara {
	private String marca;
	private int lumenex;
	
	

	public int getLumenex() {
		return lumenex;
	}

	public void setLumenex(int lumenex) {
		this.lumenex = lumenex;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Lampara(String marca, int lumenex) {
		super();
		this.marca = marca;
		this.lumenex = lumenex;
	}
	public Lampara(String marca) {
		super();
		this.marca = marca;
		this.lumenex = 5;
	}
	public Lampara() {
		super();
		this.marca = "sss";
		this.lumenex = 5;
	}

	public void encender() {
		System.out.println("La lampara iluma con 5 lumenex");
	}

	public void encender(int lumenex) {
		System.out.println("La lampara iluma con " + lumenex + " lumenex");
	}

}
