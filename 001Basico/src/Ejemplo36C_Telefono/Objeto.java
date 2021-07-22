package Ejemplo36C_Telefono;

import java.util.List;

import Ejemplo36_SQL_FicheroProperties.LibroAR;

public class Objeto {

	public static void main(String[] args) {
			DataBaseHelper helper = new DataBaseHelper();
			Telefono tel = new Telefono(982548875, "Xiaomi", 50.5);
			// tel.insertar();

//			System.out.println("El telefono buscado es " + tel.buscarUno(982548875).getNumero() + " / " + tel.buscarUno(982548875).getMarca() + " / "
//					+ tel.buscarUno(982548875).getPrecio());

			Telefono telUPDATE = new Telefono(913311215, "DOMO", 5.5);
			//telUPDATE.update(982548875);
			Telefono telaborrar = new Telefono(252565655, "borrar", 8.5);
			telaborrar.insertar();
			//telaborrar.borrar();
		}

	}