package ejemplo7;

public class Caja {

	private double x;
	private double y;
	private double z;
	
	public Factura(double x, double y, double z) {
		
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public double getX() {
		return x;
	}
	// el metodo set asigna el valor
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	// el metodo set asigna el valor
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	// el metodo set asigna el valor
	public void setZ(double z) {
		this.z = z;

	}
	public Caja(double x, double y, double z) {
		super();
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	public double getVolumen() {
		return this.getX()*getY()*getZ();
	}
	public Caja getVolumenHuecoMinimo() {
		return new Caja(this.getX()*1.20,this.get()*1.20,this.getZ()*1.20));
	}


}
	

	