package ejemplo7;

public class Lampara {

	private String marca;
	private int lumenex;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public Lampara(String marca, int lumenex) {
		super();
		this.marca = marca;
		this.lumenex=lumenex;
		
	}
	public void encender() {
		System.out.println("la lampara ilumina con 5 lumenex");
	}
	public void encender(int lumenex) {
		System.out.println("la lampara ilumina con "+lumenex+" lumenex");
	}
}