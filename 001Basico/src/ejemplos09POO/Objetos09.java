package ejemplos09POO;

public class Objetos09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = new String("hola");
		
		System.out.println(cadena);
		
		String cadena2 = "hola2";
		System.out.println(cadena2);
		System.out.println(cadena2.charAt(4));
		System.out.println(cadena2.length());
		System.out.println(cadena2.repeat(3));
		
		String [] lista = cadena2.split("l");
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		char[] caracteres =  cadena2.toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			 System.out.println(caracteres[i]);
		}
		
		for (int i = caracteres.length-1; i >= 0 ; i--) {
			 System.out.println(caracteres[i]);
		}
		
	}

}
