package com.arquitecturajava.ejemplos28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.arquitecturajava.ejemplos26.Persona;

public class Objetos28 {
	
public static void main(String[] args) {
	
	Factura f= new Factura(1,"compraA");
	f.addLineaFactura(new LineaFactura(1,"ordenador",400,f));
	f.addLineaFactura(new LineaFactura(2,"tablet",200,f));
	Factura f2= new Factura(2,"compraB");
	f2.addLineaFactura(new LineaFactura(1,"leche",2,f2));
	f2.addLineaFactura(new LineaFactura(2,"galletas",3,f2));
	Map<String,List<Factura>> mapa= new HashMap<String,List<Factura>>();
	List<Factura> lista1= new ArrayList<Factura>();
	lista1.add(f);
	lista1.add(f2);
	mapa.put("pedro",lista1);
	
	List<Factura> nueva= mapa.get("pedro");
	
	for(Map.Entry<String, List<Factura>> entrada : mapa.entrySet()) {
		
		List<Factura> nuevaLista=entrada.getValue();
		for(Factura factura : nuevaLista) {
			
			System.out.println(factura.getConcepto());
			System.out.println(factura.getImporte());
			for (LineaFactura linea : factura.getLineas()) {
				
				System.out.println(linea.getConcepto());
				System.out.println(linea.getImporte());
				System.out.println(linea.getNumero());
				
			}
		}
		
		
		
	}
	
}
}
