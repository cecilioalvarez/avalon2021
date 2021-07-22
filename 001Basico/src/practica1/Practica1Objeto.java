package practica1;

public class Practica1Objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t=new Telefono(942131320,"samsung",200);
		t.insertar();
		
		for(Telefono tel : t.mostrarTodos()) {
			System.out.println(tel);
			
		}
		t.setMarca("nokia");
		t.actualizar();
		
		for(Telefono tel : t.mostrarTodos()) {
			System.out.println(tel);
			
		}
		

	}

}
