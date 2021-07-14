package com.arquitecturajava.ejemplo7;

public class Lamparas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampara L1=new Lampara("marca",9);
		Lampara L2=new Lampara("Acme");
		Lampara L3=new Lampara(21);
		System.out.println(L1.getMarca());
		System.out.println(L1.getLumenex());
		System.out.println(L2.getMarca());
		System.out.println(L3.getLumenex());
	}

}
