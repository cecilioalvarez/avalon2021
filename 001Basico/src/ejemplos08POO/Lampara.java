package ejemplos08POO;

public class Lampara {
	private String marca;
	private int lumenes;
	
	
	//Sobrecarga de constructor
	public Lampara() {
		super();
		this.marca = "m3";
		this.lumenes=5;
	}
	
	public Lampara(String marca) {
		super();
		this.marca = marca;
		this.lumenes=10;
	}

	public Lampara(String marca,int lumenes) {
		super();
		this.marca = marca;
		this.lumenes=lumenes;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getLumenes() {
		return lumenes;
	}

	public void setLumenes(int lumenes) {
		this.lumenes = lumenes;
	}

	//Sobrecarga de Metodos
	public void encender() {
		System.out.println("La lampara ilumina con 5 lumenes");
	}
	public void encender(int lumenes) {
		System.out.println("La lampara ilumina con "+ lumenes+" lumenes");
	}
}
