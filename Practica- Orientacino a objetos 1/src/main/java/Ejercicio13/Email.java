package Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private List<Archivo>adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public List<Archivo> getAdjuntos(){
		return this.adjuntos;
	}
	
	public int tamañoEmail() {
		return this.titulo.length() + this.cuerpo.length() + adjuntos.stream().mapToInt(a -> a.tamaño()).sum();
	}
	
	

}
