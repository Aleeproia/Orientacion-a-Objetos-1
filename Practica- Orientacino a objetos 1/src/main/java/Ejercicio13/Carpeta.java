package Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	
	private String nombre;
	private List<Email>emails;
	
	

	public Carpeta(String nombre) {
		super();
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

	public void agregarInbox(Email email) {
		this.emails.add(email);
		
	}

	public void quitar(Email email) {
		this.emails.remove(email);	
	}


	
}
