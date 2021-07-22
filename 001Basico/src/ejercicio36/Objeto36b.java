package ejercicio36;

import java.util.List;

public class Objeto36b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CapituloRepository repositorio=new CapituloRepositoryJDBC();
		List<Capitulo> capitulos=repositorio.buscarTodos();
		
		for(Capitulo c: capitulos) {
			System.out.println(c);
		}
		

	}

}
