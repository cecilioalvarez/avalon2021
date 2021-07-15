package Ejemplos16Herencia;

import java.util.ArrayList;

public class Objetos16Compra {

	public static void main(String[] args) {

		CompraStandard cs = new CompraStandard("Pepe", "Ordenador", 100);
		System.out.println(cs.getImporteTotal());
		
		CompraPrime cprime = new CompraPrime("Pepe", "Ordena2", 100);
		System.out.println(cprime.getImporteTotal());
		
		CompraPrimera cprimera = new CompraPrimera("Pepe", "Ordena3", 100);
		System.out.println(cprimera.getImporteTotal());
		
		//Polimorfismo: Apunto a objeto CompraStandard desde objeto Compra
		//Puedo hacer esto haciendo referencia a clase hija desde clase Padre
		Compra cs2 = new CompraStandard("Pepe", "Ordenador", 100);
		System.out.println(cs2.getImporteTotal());
		
		Compra cprime2 = new CompraPrime("Pepe", "Ordena2", 100);
		System.out.println(cprime2.getImporteTotal());
		
		//Se pueden añadir en arraylist objetos de clases hijas de la padre
		ArrayList<Compra> lista = new ArrayList<Compra>();
		lista.add(cs);
		lista.add(cprime);
		
		double total=0;
		for (Compra c : lista) {
			total+=c.getImporteTotal();
		}
		System.out.println(total);
		
		System.out.println("---------------------------");
		Cliente cli = new Cliente("Pedro");
		cli.setListadoCompras(lista);
		System.out.println(cli.sumaCompras());
		cli.addCompra(cprime);
		System.out.println(cli.sumaCompras());
		cli.addCompra(new CompraPrimera("Pepe", "Ordena3", 100));
		System.out.println(cli.sumaCompras());
		Compra comp=cli.getCompraMasCara();
		System.out.println(comp.getConcepto()+"-"+comp.getImporteTotal());
	}

}
