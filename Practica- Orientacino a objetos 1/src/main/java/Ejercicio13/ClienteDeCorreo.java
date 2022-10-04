package Ejercicio13;

import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public void recibir(Email email) {
		this.inbox.agregarInbox(email);
	}
	
	public void mover(Email email,Carpeta origen,Carpeta destino) {
		origen.quitar(email);
		destino.agregarInbox(email);
	}
	
	
}
