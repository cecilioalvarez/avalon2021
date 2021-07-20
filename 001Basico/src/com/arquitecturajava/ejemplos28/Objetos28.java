package com.arquitecturajava.ejemplos28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Objetos28 {

	public static void main(String[] args) {

		//hacer un mapa o diccionario que contiene como clave el 
		//nombre de un cliente y como valor una lista de facturas del cliente, la cual tendra a
		//su vez, una lista de lineas.
		Factura f = new Factura(1, "compraA");
		f.addLineasFatura(new LineasFactura(1,"ordenador", 400, f));
		f.addLineasFatura(new LineasFactura(2,"tablet", 200, f));
		Factura f2 = new Factura(2, "compraB");
		f2.addLineasFatura(new LineasFactura(1,"leche", 2, f2));
		f2.addLineasFatura(new LineasFactura(2,"galletas", 3, f2));
		Map<String,List<Factura>> mapaLineas = new HashMap<String, List<Factura>>();
		List<Factura> lista1= new ArrayList<Factura>();
		lista1.add(f);
		lista1.add(f2);
		mapaLineas.put("pedro", lista1);
		
		List<Factura> nueva = mapaLineas.get("pedro");
		for(Map.Entry<String, List<Factura>> entrada : mapaLineas.entrySet()) {
			List<Factura> nuevaLista = entrada.getValue();
			for(Factura factura: nuevaLista) {
				System.out.println(factura.getConcepto());
				System.out.println(factura.getImporte());
				for(LineasFactura linea: factura.getLineas()) {
					System.out.println(linea.getConcepto());
					System.out.println(linea.getImporte());
					System.out.println(linea.getNumero());
				}
			}
		}
	}

}
