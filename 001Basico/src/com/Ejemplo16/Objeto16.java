package Ejemplo16;

import java.util.ArrayList;

public class Objeto16 {

	public static void main(String[] args) {

		// variable de tipo compra el importe sale 100 no añade nada
				// clase padre
				CompraStandard cs= new CompraStandard("pepe", "ordenador", 100);
				System.out.println(cs.getImporteTotal());
				CompraStandard cs2= new CompraStandard("pepe", "ordenador", 600);
				System.out.println(cs2.getImporteTotal());
				
				// variable de tipo compra el importe sale 100 no añade nada
				CompraPrime cp= new CompraPrime("pepe", "ordenador", 100);
				System.out.println(cp.getImporteTotal());
				CompraPrime cp2= new CompraPrime("pepe", "pantalla", 300);
				System.out.println(cp2.getImporteTotal());
				
				ArrayList<Compra> lista= new ArrayList<Compra>();
				lista.add(cs);
				lista.add(cs2);
				lista.add(cp);
				lista.add(cp2);
				double total=0;
				for (Compra c: lista) {
					total+=c.getImporteTotal();
					
				}
				System.out.println(total);

	}

}
