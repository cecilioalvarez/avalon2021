package _001_Introduccion;

public class _008Java_Acumuladores {

	public static void main(String[] args) {
		
		//cuando el incremento o el decremento es de uno en uno 
		//podemos cambiar la forma de i=i+1; por la forma i++ o i--;
		
		int nota1 = 5;
		int nota2 = nota1 + 2;
		
		System.out.println(nota2);
		nota2++;
		System.out.println(nota2);
		nota2++;
		System.out.println(nota2);
		nota2--;
		System.out.println(nota2);
		nota2--;
		System.out.println(nota2);
	}

}
