package _001_Introduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _004Java_VariablesTexto_LeerDesdeTeclado2 {

	public static void main(String[] args) {
		
		String texto ="";
		int x=0;
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer=new BufferedReader(in);
		
		try {
			texto=buffer.readLine();
			x=Integer.parseInt(texto);
		}catch (IOException e) {
			System.out.println("debes escribir un nuyemro");
		}
		
		System.out.println(x+5);
		
		//convertir variable double a texto
		double y=x*33.5;
		
		System.out.println(String.valueOf(y)+456+"texto");
		
	}
}
