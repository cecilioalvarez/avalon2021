package _012_POO_Sobrecarga_Estatica;

public class ObjetoLibro {

	public static void main(String[] args) {
		
		ClaseLibro l1=new ClaseLibro();
		l1.setTitulo("el juego de tronos");
		l1.setPaginasTotales(250);
		
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina(10);
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarCapitulo();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarPagina();
		System.out.println(l1.getPaginaActual());
		
		l1.avanzarCapitulo();
		System.out.println(l1.getPaginaActual());
	}

}
