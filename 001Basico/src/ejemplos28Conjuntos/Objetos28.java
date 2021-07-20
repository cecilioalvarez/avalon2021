package ejemplos28Conjuntos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ejemplos26JavaAPIS.Persona;

public class Objetos28 {

	public static void main(String[] args) {
		
		Factura f1= new Factura(0, "Comida");
		f1.addLineaFactura(new LineaFactura(0, "Hamburguesa", 9.50,f1));
		f1.addLineaFactura(new LineaFactura(1, "Bebida", 2.50,f1));
		
		Factura f2= new Factura(1, "Ropa");
		f2.addLineaFactura(new LineaFactura(0, "Camiseta", 11.50,f2));
		f2.addLineaFactura(new LineaFactura(1, "Pantalon", 21.50,f2));
		
		Factura f3= new Factura(2, "Gimnasio");
		f3.addLineaFactura(new LineaFactura(0, "Cuota", 19.50,f3));
		f3.addLineaFactura(new LineaFactura(1, "Toalla", 1.50,f3));
		
		ArrayList<Factura> ar1=new ArrayList<Factura>();
		ar1.add(f1);
		ar1.add(f2);
		
		ArrayList<Factura> ar2=new ArrayList<Factura>();
		ar2.add(f2);
		ar2.add(f3);
		
		ArrayList<Factura> ar3=new ArrayList<Factura>();
		ar3.add(f1);
		ar3.add(f3);
		
		Map<String, List<Factura>> mapa = new HashMap<String, List<Factura>>();
		mapa.put("Pepe", ar1);
		mapa.put("Maria", ar2);
		mapa.put("Jose", ar3);
		
		
		
		for(Map.Entry<String, List<Factura>> mapElement: mapa.entrySet()) {
			System.out.println(mapElement.getKey());
			double total=0;
			for(Factura f: mapElement.getValue()) {
				total+=f.sumaImportes();
				System.out.println("Factura nº "+f.getNumero()+" Total->"+f.sumaImportes());
				//Puedo hacer otro for para las lineas de la factura
				for(LineaFactura lf:f.getLineasFactura()) {
					System.out.println("Linea de factura nº "
							+lf.getFactura().getNumero()+"-> "+lf.getNumero()+". "
							+lf.getConcepto()+"-"+lf.getImporte());
				}
			}
			System.out.println("Suma Facturas "+total);
			System.out.println("--------------------");
		}

		//System.out.println(f1.sumaImportes());
	}

}
