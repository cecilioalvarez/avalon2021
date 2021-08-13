package SpringProxy_POA_Mensajes;

public class FactoriaGestorMensaje {

	public static GestorMensaje getMensaje() {
		
		GestorMensajeProxy proxy= new GestorMensajeProxy();
		proxy.setGestorMensaje(new GestorMensajeStandard());
		return proxy;
	}
}
