package polimorfismo03;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Normal nor = new Normal("pepe", "arroz", 1.20);
		System.out.println(nor.getImporteTotal());

		Prime prim = new Prime("ana2", "pan", 1.50);
		System.out.println(prim.getImporteTotal());
		Normal nor2 = new Normal("pepe", "arroz", 8.20);
		System.out.println(nor.getImporteTotal());

		Prime prim2 = new Prime("ana", "pan", 10.50);
		System.out.println(prim.getImporteTotal());

		ArrayList<Compra> lista = new ArrayList<Compra>();
		lista.add(prim);
		lista.add(nor);

		double total = 0;

		for (Compra c : lista) {
			total += c.getImporteTotal();
		}
		System.out.println(total);
		
		ArrayList<Compra> miCompra = new ArrayList<Compra>();
		Cliente cli = new Cliente("ale", miCompra);
		
		cli.addCompras(prim2);
		cli.addCompras(prim);
		System.out.println(cli.getCompraMasCara().getImporte());
	}
	
	

}
