package Ejercicio13;

import java.util.List;

public class ClienteDeCorreo {
	
	private Carpeta inbox = new Carpeta("Recibidos");
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		carpetas.add(inbox);
	}
	
	public void recibir(Email email) {
		this.inbox.agregarMail(email);
	}
	
	public void mover(Email email,Carpeta origen,Carpeta destino) {
		origen.quitar(email);
		destino.agregarMail(email); // destino.getEmails().add(email);
	}
	
	public Email buscar(String texto) {
		return carpetas.stream().map( c -> c.buscarEmail(texto))
				.filter(c -> c != null)
				.findFirst() // tira excepcion si el elemento es null. hay que asegurarse que no lo sean. por eso filtro antes 
				.orElse(null);
		//return carpetas.stream().map( c -> c.getEmails().stream().map(e -> e.getTexto().contains(texto)))
	}
}
