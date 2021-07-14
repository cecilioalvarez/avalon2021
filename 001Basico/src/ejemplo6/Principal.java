package ejemplo6;

public class Principal {
	public static void main(String[] args) {
		int numero=4;
		Factura factura1=new Factura("luz", 32.30, false);
	System.out.println(factura1.getConcepto() + " "+ factura1.isPagada());
	System.out.println(factura1.getImporte());
	
	if (factura1.isPagada()) {
		System.out.println("Factura pagada");
	}else {
		System.out.println("Factura no pagada");
	}
		
}
}