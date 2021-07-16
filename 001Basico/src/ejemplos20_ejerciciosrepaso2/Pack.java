package ejemplos20_ejerciciosrepaso2;

import java.util.ArrayList;

public class Pack {

	/*Muy Complejo de controlar
	ArrayList<Donut> listadoDonuts = new ArrayList<Donut>();

	public ArrayList<Donut> getListadoDonuts() {
		return listadoDonuts;
	}
	
	public void addDonut(Donut donut) {
		if (this.getListadoDonuts().size()>0 
				&& this.getListadoDonuts().size()<3) {
			if (this.getListadoDonuts().size()==1 
					&& donut.equals(this.getListadoDonuts().get(0))) {
				this.getListadoDonuts().add(donut);
			}else {
				System.out.println("No se puede añadir");
			}
		}else if(this.getListadoDonuts().size()==0) {
			this.getListadoDonuts().add(donut);
		}else {
			System.out.println("No se puede añadir");
		}
	}*/
	
	private Donut donut1;
	private Donut donut2;
	
	/*public Pack(Donut donut1) {
		super();
		this.donut1 = donut1;
		this.donut2 = new Donut(donut1.getSabor(),donut1.getPrecio());
	}*/
	
	//Mejor Aproximación
	public Pack(String sabor,double precio) {
		super();
		this.donut1 = new Donut(sabor,precio/2);
		this.donut2 = new Donut(sabor,precio/2);
	}

	public Donut getDonut1() {
		return donut1;
	}

	public Donut getDonut2() {
		return donut2;
	}
	
	public double getPrecio() {
		return this.getDonut1().getPrecio()+this.getDonut2().getPrecio();
	}
	
	public void setSabor(String sabor) {
		this.getDonut1().setSabor(sabor);
		this.getDonut2().setSabor(sabor);
	}
	
	public String getSabor() {
		return this.getDonut1().getSabor();
	}
	
}
