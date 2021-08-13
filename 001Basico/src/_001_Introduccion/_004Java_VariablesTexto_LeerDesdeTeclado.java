package _001_Introduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _004Java_VariablesTexto_LeerDesdeTeclado {

	public static void main(String[] args) {
		
		String texto ="";
		int x=0;
		//lo que vamos hacer es crear un objeto que permita abrir 
		//un flujo de datos desde el exterior
		InputStreamReader in = new InputStreamReader(System.in);
		
		//el buffer es un objeto que almacena los datos de ese canal
		BufferedReader buffer=new BufferedReader(in);
		
		//debemos rodear con un try cathc por que pueden ocurrir 
		//errores de captura de datos desde el teclado
		try {
			texto=buffer.readLine();
		}catch (IOException e) {
		}
		
		System.out.println(texto);
		
		//concatenacion
		System.out.println(texto.concat(" esto es una concatenacion"));
		
		//minusculas
		System.out.println(texto.concat(" ANTES ESTABA EN MAYUSCULA").toLowerCase());
		
		//mmayusculas
		System.out.println(texto.concat(" antes estaba en minuscula").toUpperCase());
		
		//cuantas letras estan en una variable string
		System.out.println("el texto tiene "+texto.length()+" caracteres");
		
	}
}
