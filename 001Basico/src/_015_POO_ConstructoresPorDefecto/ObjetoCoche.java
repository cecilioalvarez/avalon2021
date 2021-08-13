package _015_POO_ConstructoresPorDefecto;

public class ObjetoCoche {

	public static void main(String[] args) {
		
		//como vemos en la clase Coche no hemos contruido constructores para el objeto Coche
		//por defecto Java los ha construido
		//constructor por defecto:
		//si en la clse añadimos un constructor para el objeto coche, ya nuestro programa no va a funcionar y debemos
		//cambiar la forma como asignamos los parametros del coche
		Coche c1=new Coche();
		
		c1.setMarca("toyota");
		c1.setModelo("C-HR");
		
		System.out.println(c1.getMarca());
		
		System.out.println(c1.getModelo());
		


	}

}
