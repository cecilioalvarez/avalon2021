package repasoInterfaz;

public class Main {

	public static void main(String[] args) {
		Pan miPan = FactoryPan.getPan("INTEGRAL");
		miPan.cocer();
	}
}
