package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorrreoConAdjuntos;

import java.util.List;
import java.util.ArrayList;

public class ClienteDeCorreo {
	
	private List<Carpeta>carpetas;
	private Carpeta carpeta;
	
	
	
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
	}
	public List<Carpeta> getCarpetas() {
		return carpetas;
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}

	public Carpeta getCarpeta() {
		return carpeta;
	}
	
	
	public void recibir(Email email) {
		this.carpeta.agregarEmail(email);		
	}
	
	public void mover(Email email,Carpeta origen,Carpeta destino) {
		destino.agregarEmail(email);
		origen.eliminarEmail(email);
	}
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c->c.buscarEmail(texto)).filter(email ->email != null).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamañoEmail()).sum();
		
	}
}
