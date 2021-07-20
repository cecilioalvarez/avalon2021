package ejercicio31;

import java.util.ArrayList;
import java.util.List;

public class Objeto31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		List<String> lista= new ArrayList<>();
//		lista.add("hola");
//		lista.add("que");
//		lista.add("tal");
//		
//		for(String cadena: lista) {
//			System.out.println(cadena);
//		}
//		
//		Integer numero=Integer.valueOf(5);
//		String numero2="7";
//		int numero3=Integer.parseInt(numero2);
//		System.out.println(numero3+1);
//		List<Integer> lista2=new ArrayList<>();
		
		
		BolsaCadenas b=new BolsaCadenas(3);
		b.add("galletas");
		b.add("tomates");
		b.add("otras");
		b.add("leche");
		
		for(String o : b.getLista()) {
			System.out.println(o.toUpperCase());
		}
		
		
	}

}
