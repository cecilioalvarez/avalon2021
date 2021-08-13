package SinSpring_Introduccion;

import SpringProxy_POA_Facturas.FacturaProxy;

public class FactoriaFacturas {
	
	//por que todo esto?
	//esto lo que hace es restringir la visibildiad dde la factura con iva o sin iva
	//de tal manera podamos entrar a traves de la factoria
	//esto simplicfica la forma de trabajar
	//nos permite trabajar con jerarquia de clases muy complejas de forma muy sencilla
	//ya que solo podemos ver la clase padre
	//SPRING es una mega factoria , nos permite construir clases de objetos y parametros de forma sencilla 
	//y ademas añadir comportamiento adicional

	
	public static Factura getInstance(String tipo) {
		if (tipo.equals("IVA")) {
			return new FacturaConIva();
		}else {
			return new FacturaSinIva();
		}
	}

}
