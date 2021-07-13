package ejemplo8;

import com.sun.tools.classfile.StackMapTable_attribute.verification_type_info;

public class Objetos10 {
	
	public static void main(String[] args) {
		
		String cadena= new String("hola");
		System.out.println(cadena);
		String cadena2="hola2";
		System.out.println(cadena2);
		System.out.println(cadena2.chartAt(4));
		System.out.println(cadena2.lenght());
		System.out.println(cadena2.repeat(3));
		String[] lista=cadena2split("l");
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(caracteres[i]);
		}
		for(int i=0;i<lista.length;i++) {
			System.out.println(cadena2.charAt(i));
	} 
}
