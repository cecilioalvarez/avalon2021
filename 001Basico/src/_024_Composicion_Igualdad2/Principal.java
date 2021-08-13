package _024_Composicion_Igualdad2;

public class Principal {

	public static void main(String[] args) {

		//esta igualdad es una regla de negocio
		//sera el negicio el que defina cuales son las variables que debe comparar para evaluar la igualdad
		//en este caso vamos a definir que dos personas son iguales por que su nombre es igual
		//pero en otro programa podría ser el DNI
		Persona p = new Persona("juan");
		Persona p1 = new Persona("juan");
		
		//forma rapida
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		// java con este metodo opera de una forma muy directa
		System.out.println(p.equals(p1));
		
	}

}
