package Ejemplo36C_Telefono;

import java.util.List;

import Ejemplo36_SQL_FicheroProperties.LibroAR;

public class Objeto {

	public static void main(String[] args) {
		
		List<LibroAR> lista= LibroAR.buscarTituloyAutor("java", "pedro");

		for (LibroAR libro: lista) {

			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());

		}

	}

	}