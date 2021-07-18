package Ejercicio_donut;

import java.util.ArrayList;

public class Pack {
	private Donut donut1;
	private Donut donut2;

	public Donut getDonut1() {
		return donut1;
	}
	public Donut getDonut2() {
		return donut2;
	}
	public Pack(Donut donut1) {
		super();
		this.donut1 = donut1;
		this.donut2 = new Donut(donut1.getSabor(),donut1.getPrecio());
	}
	public double getPrecio() {
		return this.donut1.getPrecio()+this.donut2.getPrecio();
	}
	public void setSabor(String sabor) {
		this.getDonut1().setSabor(sabor);
		this.getDonut2().setSabor(sabor);
		
		
	}
	
	
	
}