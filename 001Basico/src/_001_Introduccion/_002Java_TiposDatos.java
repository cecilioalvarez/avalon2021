package _001_Introduccion;

public class _002Java_TiposDatos {

	public static void main(String[] args) {

		// para duplicar el codigo utilizamos ctrl+alt+flecha abajo
		
		// numeros enteros	
		byte numero = 5;// byte va de -127 a 128
		short numero2 = 700;// short va hasta 32 mil
		int numero3 = 2000000;
		long numero4 = 20000000;

		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);

		// numeros decimales
		float numero5 = 2000.2056f;
		double numero6 = 2000.456;
		
		System.out.println(numero5);
		System.out.println(numero6);

		// caracter
		char letra = 'a';
		System.out.println(letra);

		// booleanos
		boolean cierto = true;
		boolean falso = false;

		System.out.println(cierto);
		System.out.println(falso);

		// String no es un tipo de dato a nivel de lenguaje de java es una clase
		String texto = "cadena de texto";
		System.out.println(texto);
		
		int variable;
		variable = 30;
		System.out.println(variable);
		
	}

}
