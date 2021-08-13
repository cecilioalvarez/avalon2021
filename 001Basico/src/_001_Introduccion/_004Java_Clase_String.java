package _001_Introduccion;

public class _004Java_Clase_String {

	public static void main(String[] args) {
		
		String mensaje="hola";
		System.out.println(mensaje);
		
		//concatenacion
		String mensaje2= mensaje + " ¿como estas?";
		System.out.println(mensaje2);
		
		//extraer la segunda posicion, ojo que en java se empieza a contar de 0
		System.out.println(mensaje2.charAt(3)); 
		
		//definir el tamaño total de la cadena de texto
		System.out.println(mensaje2.length());
		
		//poner el texto en mayusculas
		System.out.println(mensaje2.toUpperCase());
		
	}

}
