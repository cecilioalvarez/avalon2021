package com.arquitecturajava.practica1;

import java.util.List;

import com.arquitecturajava.ejemplos35Cecilio.LibroAR;

public class ObjetosPractica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono=new Telefono(632546787,"huawei",220.36);
		telefono.insertarTelefono();
		
		System.out.println("-------------BÚSQUEDA DE TODOS LOS DATOS DE LA BBDD -----------------");
		List<Telefono> listaTelefonos = Telefono.buscarTodos();
		for (Telefono t: listaTelefonos) {
			
			System.out.println(t.getNumero());
			System.out.println(t.getMarca());
			System.out.println(t.getImporte());
			
		}
		
		System.out.println("-------------BÚSQUEDA POR MARCA -----------------");
		
		Telefono telefono2 = Telefono.buscarUnoPorMarca("xiaomi");
		System.out.println(telefono2.getNumero());
		System.out.println(telefono2.getMarca());
		System.out.println(telefono2.getImporte());
		
		System.out.println("-------------BÚSQUEDA POR NUMERO Y MARCA -----------------");
		
		List<Telefono> listaTelefonos2 = Telefono.buscarTodosNumeroMarca(653596368, "xiaomi");
		for (Telefono t1: listaTelefonos2) {
			
			System.out.println(t1.getNumero());
			System.out.println(t1.getMarca());
			System.out.println(t1.getImporte());
		}
	}

}
