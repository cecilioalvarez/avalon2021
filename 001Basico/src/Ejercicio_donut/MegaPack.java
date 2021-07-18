package Ejercicio_donut;

import java.util.ArrayList;

public class MegaPack {
	private ArrayList<Pack> pack1;
	private ArrayList<Pack> pack2;
	private ArrayList<Pack> pack3;
	public MegaPack(ArrayList<Pack> pack1, ArrayList<Pack> pack2, ArrayList<Pack> pack3) {
		super();
		this.pack1 = pack1;
		this.pack2 = pack2;
		this.pack3 = pack3;
	}
	public ArrayList<Pack> getPack1() {
		return pack1;
	}
	public void setPack1(ArrayList<Pack> pack1) {
		this.pack1 = pack1;
	}
	public ArrayList<Pack> getPack2() {
		return pack2;
	}
	public void setPack2(ArrayList<Pack> pack2) {
		this.pack2 = pack2;
	}
	public ArrayList<Pack> getPack3() {
		return pack3;
	}
	public void setPack3(ArrayList<Pack> pack3) {
		this.pack3 = pack3;
	}
}
