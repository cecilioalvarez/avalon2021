package _001_Introduccion;

public class _006Java_OperadoresMatematicos {

	public static void main(String[] args) {
		
		int nota = 5;
		int nota2 = nota;
		System.out.println(nota);
		System.out.println(nota2);
		
		int nota3 = nota2*nota;
		System.out.println(nota3);
		
		//los decimales entre dos int no se muestra
		//para sacar el residuo utilizamos %
		System.out.println("la divicion entre 25 y 3 es:  " + nota3/3);
		System.out.println("el residuo entre 25 y 3 es:  " + nota3%3);
		
		// operaciones matematicas básicas
		
		double nota4 = 2.5;
		double nota5 = 7.75;
		
		double sumaNotas = nota4+nota5;
		double restaNotas = nota4-nota5;
		double multiplicaNotas = nota4*nota5;
		double divideNotas = nota4/nota5;
		
		System.out.println(sumaNotas);
		System.out.println(restaNotas);
		System.out.println(multiplicaNotas);
		System.out.println(divideNotas);
		
	}

}
