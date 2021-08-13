package SpringProxy_POA_Mensajes;

public class GestorMensajeStandard implements GestorMensaje {
	@Override
	public void enviar(String texto) {
		System.out.println("el mensaje es "+texto);
	}

}
