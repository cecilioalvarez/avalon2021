package Lampara;

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
	public Lampara(String marca) {
		super();
		this.marca = marca;
		this.lumenex=10;
	}
	
	public Lampara() {
		super();
		this.marca = "m3";
		this.lumenex=5;
	}
	
	
	public Lampara(String marca, int lumenex) {
		super();
		this.marca = marca;
		this.lumenex=lumenex;
	}
	public void encender() {
		System.out.println("la lampara ilumina con 5 lumenex");
	}
	// sobrecarga de metodo
	// es el mismo metodo con argumentos diferentes
	public void encender(int lumenex) {
		System.out.println("la lampara ilumina con "+lumenex+" lumenex");
	}
	

}
