package ejemplo7;

public class Rectangulo {
	private double Lado01;
	public double getLado01() {
		return Lado01;
	}
	public void setLado01(double lado01) {
		Lado01 = lado01;
	}
	public double getLado02() {
		return Lado02;
	}
	public void setLado02(double lado02) {
		Lado02 = lado02;
	}
	private double Lado02;
	
	
	
	public Rectangulo(double lado01, double lado02) {
		super();
		Lado01 = lado01;
		Lado02 = lado02;
	}
	public double getArea() {
		return this.getLado01()*this.getLado02();
	}
	
	public double getPerimetro() {
		return this.getLado01()*2+this.getLado02()*2;
	}
	
}
	
