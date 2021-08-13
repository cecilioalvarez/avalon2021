package _005d_HilosO_Threads;

public class Principal {

	public static void main(String[] args) {
		
		
		//el objetivo de los threads es poder ejecutar procesos de forma simultanea
		//es util en aplicaciones graficas
		//esto funciona por ejemplo cuando pulsamos varios botones a la vez
		Thread hilo=new Proceso("proceso 1");
		Thread hilo2=new Proceso("proceso 2");
		
		hilo.start();
		hilo2.start();
		
		

	}

}
