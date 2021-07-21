package Practica1;

import java.util.ArrayList;
import java.util.List;

public class Ejecutable {

	public static void main(String[] args) {
		List<Telefono> lista= new ArrayList<Telefono>();
		//Telefono t1=new Telefono(1111,"Samsung",100);
		Telefono t2=new Telefono(2222,"Huawei",400);
		//Telefono t3=new Telefono(3333,"Apple",300);
		t2.actualizar();
		//t3.insertar();
		lista=Telefono.buscarTodos();
		/*for (Telefono l: lista) {
			System.out.println(l.getNumero());
			System.out.println(l.getMarca());
			System.out.println(l.getImporte());
		}*/
		System.out.println(Telefono.buscarPorNumero(1111).getMarca());
		System.out.println(Telefono.buscarPorMarca("Samsung").getImporte());
		System.out.println(Telefono.buscarPorImporte(100).getNumero());
	}

}
