package EjercicioFactura;

import java.util.HashMap;

public class Objetos28 {

	public static void main(String[] args) {
		HashMap<String, Object> mapaCliente = new HashMap<String, Object>();
		Factura f1 = new Factura(100, "Obras");
		Factura f2 = new Factura(200, "Reformas");
		Factura f3 = new Factura(300, "Arreglos");

		LineaFactura lf1 = new LineaFactura(1, "Obras", 100, f1);
		LineaFactura lf2 = new LineaFactura(1, "Reformas", 200, f2);
		LineaFactura lf3 = new LineaFactura(1, "Arreglos", 300, f3);

		mapaCliente.put("Pepe", lf1);
		mapaCliente.put("Maria", lf2);
		mapaCliente.put("Luis", lf3);

		System.out.println(mapaCliente.get("Pepe"));
		System.out.println(mapaCliente.get("Maria"));
		System.out.println(mapaCliente.get("Luis"));
	}
}
