package _001_Introduccion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _007Java_Clase_Math_BigDecimal_RoundingMode {
	
	public static void main(String[] args) {
		
		double nota1=4.2;
		double nota2=4.5;
		
		System.out.println("la suma es: " + (nota1+nota2));
		System.out.println("la resta es: " + (nota1-nota2));
		System.out.println("la division es: " + (nota1/nota2));
		System.out.println("la multiplicacion es: " + (nota1*nota2));
		
		System.out.println(Math.round((nota1-nota2) * 100.0) / 100.0);
		
		System.out.println("______________________________");
		
		//Para construir un BigDecimal podemos pasarle casi todo tipo de datos. 
		//Por ejemplo un String o un entero:
		//BigDecimal bd = new BigDecimal("5");
		//BigDecimal bd = new BigDecimal(5);
		//Los métodos que operan con BigDecimal van a devolver otro BigDecimal
		
		BigDecimal numero3= new BigDecimal(200.28999999999999999999);
		BigDecimal numero4= new BigDecimal(100.29999999999999999999);
		BigDecimal bd1 = new BigDecimal("5");
		BigDecimal bd2 = new BigDecimal(5);		
		
		//suma de BigDecimal
		BigDecimal bd3=bd1.add(bd2);
		System.out.println(bd3);
		
		//encadenamiento de metodos
		BigDecimal bd4=bd1.add(bd2).add(bd3);
		System.out.println(bd4);
		
		//Para restar utiliza substract
		BigDecimal numero5=numero4.subtract(numero3);
		System.out.println(numero5);
		
		//multiplicar utiliza multiply
		BigDecimal numero6=numero4.multiply(numero3);
		System.out.println(numero6);
		
		//para dividir existe el método divide
		BigDecimal division = numero6.divide(new BigDecimal(10));
		System.out.println(division);
		
		
		//redondeo utilizando doubleValue
		System.out.println(division.doubleValue());
		
		
		//redondeos utulizando la constante RoundingMode (java.Math.RoundingMode)
		BigDecimal numero = new BigDecimal("7.3333");
		System.out.println("El número original: " + numero.toString());
		
		// Establecer su escala y su forma de redondeo; al llamar
		// a setScale se redondea
		BigDecimal bdHalfUp = numero.setScale(3, RoundingMode.HALF_UP);
		System.out.println("El número con RoundingMode.HALF_UP: " + bdHalfUp.toString());
		
		BigDecimal bdCeiling = numero.setScale(3, RoundingMode.CEILING);
		System.out.println("El número con RoundingMode.CEILING: " + bdCeiling.toString());
		
		BigDecimal bdUp = numero.setScale(3, RoundingMode.UP);
		System.out.println("El número con RoundingMode.UP: " + bdUp.toString());
		
		BigDecimal bdFloor = numero.setScale(3, RoundingMode.FLOOR);
		System.out.println("El número con RoundingMode.FLOOR: " + bdFloor.toString());
	
	}

}
