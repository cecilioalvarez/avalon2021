package ejemplos01;

public class Objetos9 {

	
	public static void main(String []args) {
		
		String cadena=new String("hola");
		System.out.println(cadena);
		String cadena2="hola";
		System.out.println(cadena2);
		System.out.println(cadena2.charAt(4));
		System.out.println(cadena.length());
		System.out.println(cadena.repeat(3));
		String[] lista=cadena2.split("[a-z]");
		
		for(int i=0;i<lista.length;i++ ) {
			
			System.out.println(lista[i]);
		}
		
		char[] caracteres= cadena2.toCharArray();
		
		for (int i=0;i<caracteres.length;i++ ) {
			System.out.println(caracteres[i]);
		}
		
	}
}
