package _005c_ListasEnlazadas_Colas_Pilas;

import java.util.LinkedList;

public class Colas {

	public static void main(String[] args) {
		// utilizan la filosofia de FIFO: primera en entrar , primera en salir

		LinkedList cola=new LinkedList();
		
		//offer ingresa los elelemtnso, en este cadso los numero del 1 al 10
		for(int i=1;i<11;i++) {
			cola.offer(i);
		}
		//miestras la cola no este vacia, o no tenga datos, por eso utilizamos peek
		while(cola.peek()!=null) {
			//el metodo poll los muestra y elimna
			System.out.println(cola.poll());
		}
		
	}

}
