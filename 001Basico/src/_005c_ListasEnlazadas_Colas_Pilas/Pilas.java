package _005c_ListasEnlazadas_Colas_Pilas;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		
		//las pilas o stacks funcional bajo la logica FILO:firs in last out, primera en entrar ultima en salir
		
		Stack pila=new Stack();
		
		//push ingresa objetos a la pila
		pila.push(50); //toma el indice 0
		pila.push("camara"); //toma el indice 1
		pila.push("lora");
		pila.push(34);
		
		//con Stack solo podemos obtener el ultimo valor
		//peek para ver y el pop para eliminar
		System.out.println("el ultimo elemento en la pila es "+pila.peek());
		
		//este while va a tomar el dato y lo va a eliminar
		while (pila.empty()==false){
			System.out.println(pila.pop());
		}
		//como veos este ya genera un error por que la pila esta vacia
		System.out.println("el ultimo elemento en la pila es "+pila.peek());
	}

}
