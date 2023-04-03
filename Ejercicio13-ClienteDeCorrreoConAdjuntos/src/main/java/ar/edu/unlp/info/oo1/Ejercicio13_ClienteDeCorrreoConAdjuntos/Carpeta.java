package ar.edu.unlp.info.oo1.Ejercicio13_ClienteDeCorrreoConAdjuntos;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class Carpeta {
	
	private String nombre;
	private List<Email>emails;
	
	

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Email> getEmails() {
		return emails;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarEmail(Email email) {
		this.emails.remove(email);
	}
	
	public Email buscarEmail(String texto) {
		return this.emails.stream().filter(e ->e.existeEmail(texto)).findFirst().orElse(null);
	}
	
	public int tamañoEmail() {
		return (int)this.emails.stream().mapToDouble(e -> e.tamañoEmail()).sum();
	}

}
