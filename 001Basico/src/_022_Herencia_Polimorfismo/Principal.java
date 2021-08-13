package _022_Herencia_Polimorfismo;

public class Principal {

	public static void main(String[] args) {

		//los tres objetos comparten un mismo metodo, 
		//pero la información que arroja es diferente por el
		// concepto de polimorfismo
		Carro c;
		c = new TOYOTA();
		c.informacion();
		System.out.println(c.altura);
		
		Carro c2;
		c2 = new BMW();
		c2.informacion();
		System.out.println(c2.altura);

		Carro c3 = new Carro();
		c3.informacion();
		System.out.println(c3.altura);
		
		
		//vemos tambien que los hijos heredaron propiedades del papa como la altura
	}
}
