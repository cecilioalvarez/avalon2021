package ejercicio05;

public class Main {
	public static void main(String[] args) {
		Factura fc = new Factura(1, "Compra2", 10);
		System.out.println(fc.importeConIVA());
		System.out.println(fc.importeDescuento(20));
		System.out.println(fc.importeSinRetencion());
	}

}
